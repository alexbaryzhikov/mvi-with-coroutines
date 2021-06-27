package ru.alexb.mviwithcoroutines.ui.main.mvi

import dagger.hilt.android.lifecycle.HiltViewModel
import ru.alexb.mviwithcoroutines.cities.CitiesProvider
import ru.alexb.mviwithcoroutines.mvi.MviViewModel
import ru.alexb.mviwithcoroutines.ui.main.model.CityModelMapper
import ru.alexb.mviwithcoroutines.ui.main.model.LoadState
import javax.inject.Inject

@HiltViewModel
class CityViewModel @Inject constructor(
  private val citiesProvider: CitiesProvider,
  private val cityModelMapper: CityModelMapper
) : MviViewModel<CityState, CityIntent, CityReduceAction>(
  initialState = CityState.INITIAL
) {

  /* handles Intents from the View */
  override suspend fun executeIntent(intent: CityIntent) {
    when (intent) {
      is CityIntent.PrefixUpdated -> {
        if (intent.prefix.length >= MIN_CITY_LENGTH_FOR_SEARCH) {
          handle(CityReduceAction.Loading)
          loadCities(intent.prefix)
        } else {
          handle(CityReduceAction.Loaded(emptyList()))
        }
      }
    }
  }

  private suspend fun loadCities(prefix: String) {
    runCatching { citiesProvider.getCities(prefix) }
      .onSuccess { response -> handle(CityReduceAction.Loaded(response.map(cityModelMapper::mapFrom))) }
      .onFailure { error -> handle(CityReduceAction.LoadError("Failed to load cities: $error")) }
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
    private const val MIN_CITY_LENGTH_FOR_SEARCH = 2
  }
}