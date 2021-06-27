package ru.alexb.mviwithcoroutines.cities

import ru.alexb.mviwithcoroutines.ui.main.model.CityModel

data class City(val name: String) {
  fun toCityResultModel(): CityModel = CityModel(name)
}
