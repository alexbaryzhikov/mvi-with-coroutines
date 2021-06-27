package ru.alexb.mviwithcoroutines.ui.main.mvi

import ru.alexb.mviwithcoroutines.mvi.MviState
import ru.alexb.mviwithcoroutines.ui.main.model.CityModel
import ru.alexb.mviwithcoroutines.ui.main.model.LoadState

data class CityState(
  val loadState: LoadState,
  val cities: List<CityModel>,
  val errorMessage: CharSequence,
) : MviState {
  companion object {
    val INITIAL = CityState(
      loadState = LoadState.IDLE,
      cities = emptyList(),
      errorMessage = "",
    )
  }
}