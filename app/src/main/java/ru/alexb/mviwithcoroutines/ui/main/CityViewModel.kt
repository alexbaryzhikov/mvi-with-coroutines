package ru.alexb.mviwithcoroutines.ui.main

import dagger.hilt.android.lifecycle.HiltViewModel
import ru.alexb.mviwithcoroutines.data.GetCitiesInteractor
import ru.alexb.mviwithcoroutines.mvi.MviViewModel
import javax.inject.Inject

@HiltViewModel
class CityViewModel @Inject constructor(
  private val getCitiesInteractor: GetCitiesInteractor,
) : MviViewModel<CityState, CityMviIntent, CityReduceAction>(
  initialState = CityState.initial
) {

  /* handles Intents from the View */
  override suspend fun executeIntent(mviIntent: CityMviIntent) {
    when (mviIntent) {
      is CityMviIntent.PrefixUpdated -> {
        if (mviIntent.prefix.length >= MIN_CITY_LENGTH_FOR_SEARCH) {
          handle(CityReduceAction.Loading)
          runCatching { getCitiesInteractor.execute(mviIntent.prefix) }.fold(
            onSuccess = { response ->
              handle(
                CityReduceAction.Loaded(
                  cities = response.map { city -> city.toCityResultModel() }
                )
              )
            },
            onFailure = {
              handle(CityReduceAction.LoadError("Failed to load cities"))
            }
          )
        } else {
          handle(CityReduceAction.Loaded(emptyList()))
        }
      }
    }
  }

  /* creates a new state as a result of actions distilled from Intents */
  override fun reduce(state: CityState, reduceAction: CityReduceAction): CityState =
    when (reduceAction) {
      CityReduceAction.Loading -> state.copy(
        loadState = LoadState.LOADING,
        errorMessage = "",
      )
      is CityReduceAction.Loaded -> state.copy(
        loadState = LoadState.LOADED,
        cities = reduceAction.cities,
        errorMessage = "",
      )
      is CityReduceAction.LoadError -> state.copy(
        loadState = LoadState.ERROR,
        errorMessage = reduceAction.message,
      )
    }

  companion object {
    private const val MIN_CITY_LENGTH_FOR_SEARCH = 1
  }
}