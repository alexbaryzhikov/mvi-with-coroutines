package ru.alexb.mviwithcoroutines.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*

abstract class MviViewModel<S : MviState, I : MviIntent, R : MviReduceAction>(initialState: S) : ViewModel() {
  private val stateFlow = MutableStateFlow(initialState)
  val state: StateFlow<S> = stateFlow.asStateFlow()
  private val intentFlow = MutableSharedFlow<I>(extraBufferCapacity = FLOW_BUFFER_CAPACITY)
  private val reduceFlow = MutableSharedFlow<R>(extraBufferCapacity = FLOW_BUFFER_CAPACITY)

  init {
    intentFlow
      .onEach { intent -> executeIntent(intent) }
      .launchIn(viewModelScope)

    reduceFlow
      .onEach { action -> stateFlow.value = reduce(stateFlow.value, action) }
      .launchIn(viewModelScope)
  }

  fun onIntent(mviIntent: I) {
    intentFlow.tryEmit(mviIntent)
  }

  protected abstract suspend fun executeIntent(intent: I)

  protected fun handle(reduceAction: R) {
    reduceFlow.tryEmit(reduceAction)
  }

  protected abstract fun reduce(state: S, reduceAction: R): S

  companion object {
    private const val FLOW_BUFFER_CAPACITY = 64
  }
}