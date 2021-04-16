package ru.alexb.mviwithcoroutines.ui.main

import ru.alexb.mviwithcoroutines.mvi.ReduceAction

sealed class CityReduceAction : ReduceAction {
  object Loading : CityReduceAction()
  data class Loaded(val cities: List<CityResultModel>) : CityReduceAction()
  data class LoadError(val message: CharSequence) : CityReduceAction()
}