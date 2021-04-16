package ru.alexb.mviwithcoroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import ru.alexb.mviwithcoroutines.databinding.MainActivityBinding
import ru.alexb.mviwithcoroutines.ui.main.CityFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(MainActivityBinding.inflate(layoutInflater).root)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
        .replace(R.id.container, CityFragment.newInstance())
        .commitNow()
    }
  }
}