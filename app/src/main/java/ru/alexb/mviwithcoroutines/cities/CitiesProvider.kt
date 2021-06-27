package ru.alexb.mviwithcoroutines.cities

import kotlinx.coroutines.delay
import java.util.concurrent.ThreadLocalRandom
import javax.inject.Inject

class CitiesProvider @Inject constructor() {

  suspend fun getCities(prefix: String): List<City> {
    delay(500)
    when (ThreadLocalRandom.current().nextInt(0, 100)) {
      in 0..89 -> return cities.filter { it.startsWith(prefix, ignoreCase = true) }.map { City(it) }
      else -> throw RuntimeException("Not this time")
    }
  }
}