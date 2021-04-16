package ru.alexb.mviwithcoroutines.data

import kotlinx.coroutines.delay
import java.util.concurrent.ThreadLocalRandom
import javax.inject.Inject

class GetCitiesInteractor @Inject constructor() {

  suspend fun execute(prefix: String): List<CityDto> {
    delay(500)
    when (ThreadLocalRandom.current().nextInt(0, 100)) {
      in 0..95 -> return cities
        .filter { it.startsWith(prefix, ignoreCase = true) }
        .map { CityDto(it) }
      else -> throw RuntimeException("Not this time")
    }
  }
}