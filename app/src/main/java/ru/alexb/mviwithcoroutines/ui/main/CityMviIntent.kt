package ru.alexb.mviwithcoroutines.ui.main

import ru.alexb.mviwithcoroutines.mvi.MviIntent

sealed class CityMviIntent : MviIntent {
  data class PrefixUpdated(val prefix: String) : CityMviIntent()
}