package ru.alexb.mviwithcoroutines.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.alexb.mviwithcoroutines.R
import ru.alexb.mviwithcoroutines.databinding.CityFragmentBinding
import ru.alexb.mviwithcoroutines.ui.main.model.LoadState
import ru.alexb.mviwithcoroutines.ui.main.mvi.CityIntent
import ru.alexb.mviwithcoroutines.ui.main.mvi.CityState
import ru.alexb.mviwithcoroutines.ui.main.mvi.CityViewModel

@AndroidEntryPoint
class CityFragment : Fragment() {
  private val viewModel: CityViewModel by viewModels()
  private var binding: CityFragmentBinding? = null

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = CityFragmentBinding.inflate(inflater, container, false)
    return binding!!.root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    binding = null
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    viewModel.state
      .onEach(::bindState)
      .launchIn(lifecycleScope)

    binding!!.input.doAfterTextChanged { prefix ->
      viewModel.onIntent(CityIntent.PrefixUpdated(prefix.toString()))
    }
  }

  private fun bindState(state: CityState) {
    when (state.loadState) {
      LoadState.IDLE -> {
        // do nothing
      }
      LoadState.LOADING -> binding!!.output.text = getString(R.string.state_loading)
      LoadState.LOADED -> binding!!.output.text = state.cities.map { it.name }.joinToString("\n")
      LoadState.ERROR -> binding!!.output.text = state.errorMessage
    }
  }

  companion object {
    fun newInstance(): CityFragment = CityFragment()
  }
}