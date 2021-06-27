package ru.alexb.mviwithcoroutines.ui.main.mvi

import ru.alexb.mviwithcoroutines.mvi.MviIntent

sealed class CityIntent : MviIntent {
  data class PrefixUpdated(val prefix: String) : CityIntent()
}