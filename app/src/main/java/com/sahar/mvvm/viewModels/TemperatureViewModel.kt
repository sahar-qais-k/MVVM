package com.sahar.mvvm.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sahar.mvvm.util.MyColors

class TemperatureViewModel: ViewModel(){
    val color = MutableLiveData<MyColors>()
    val temperature = MutableLiveData<String>()

    fun changeColor(value: Int) =
        when {
            value < 0 -> color.postValue(MyColors.BLUE)
            value in 0..20 -> color.postValue(MyColors.GREEN)
            value in 21..30 -> color.postValue(MyColors.YELLOW)
            value in 31..40 -> color.postValue(MyColors.ORANGE)
            else -> color.postValue(MyColors.RED)
        }
}