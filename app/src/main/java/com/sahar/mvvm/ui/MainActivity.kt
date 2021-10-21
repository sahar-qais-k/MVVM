package com.sahar.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.sahar.mvvm.R
import com.sahar.mvvm.databinding.ActivityMainBinding
import com.sahar.mvvm.viewModels.TemperatureViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private  val viewModel : TemperatureViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.temperature.observe(this , {
            if(!it.isNullOrBlank()) {
                val convertedTemperature = (it.toInt() - 32) * 5 / 9
                binding.textView.text = convertedTemperature.toString()
                viewModel.changeColor(convertedTemperature)
            }else binding.textView.text = ""
        })
    }
}
