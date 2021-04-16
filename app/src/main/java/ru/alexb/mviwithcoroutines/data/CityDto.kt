package ru.alexb.mviwithcoroutines.data

import ru.alexb.mviwithcoroutines.ui.main.CityResultModel

data class CityDto(val name: String) {
  fun toCityResultModel(): CityResultModel = CityResultModel(name)
}
