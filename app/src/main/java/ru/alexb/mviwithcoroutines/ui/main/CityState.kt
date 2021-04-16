package ru.alexb.mviwithcoroutines.ui.main

import ru.alexb.mviwithcoroutines.mvi.State

data class CityState(
  val loadState: LoadState,
  val cities: List<CityResultModel>,
  val errorMessage: CharSequence,
) : State {
  companion object {
    val initial = CityState(
      loadState = LoadState.IDLE,
      cities = emptyList(),
      errorMessage = "",
    )
  }
}