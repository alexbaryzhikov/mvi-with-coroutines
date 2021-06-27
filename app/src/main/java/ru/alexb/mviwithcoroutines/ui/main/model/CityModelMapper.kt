package ru.alexb.mviwithcoroutines.ui.main.model

import ru.alexb.mviwithcoroutines.cities.City
import javax.inject.Inject

class CityModelMapper @Inject constructor() {
  fun mapFrom(city: City): CityModel = CityModel(city.name)
}