package ru.barssv.android.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.barssv.android.button.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun onClickResult(view: View) {
        binding.text.text = "Кнопка Работает"


    }



}