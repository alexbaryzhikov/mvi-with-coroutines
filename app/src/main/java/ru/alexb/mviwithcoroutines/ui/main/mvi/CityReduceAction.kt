package ru.alexb.mviwithcoroutines.ui.main.mvi

import ru.alexb.mviwithcoroutines.mvi.MviReduceAction
import ru.alexb.mviwithcoroutines.ui.main.model.CityModel

sealed class CityReduceAction : MviReduceAction {
  object Loading : CityReduceAction()
  data class Loaded(val cities: List<CityModel>) : CityReduceAction()
  data class LoadError(val message: CharSequence) : CityReduceAction()
}