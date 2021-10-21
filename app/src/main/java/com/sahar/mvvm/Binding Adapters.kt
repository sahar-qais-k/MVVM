package com.sahar.mvvm

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.sahar.mvvm.util.MyColors

@BindingAdapter(value = ["myColors"])
fun setMyColors(view : View, myColors: MyColors?){
    when(myColors){
        MyColors.RED -> view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.red))
        MyColors.YELLOW -> view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.yellow))
        MyColors.BLUE -> view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.blue))
        MyColors.GREEN -> view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.green))
        MyColors.ORANGE -> view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.orange))
    }
}