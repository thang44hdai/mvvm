package com.example.mvvm

import android.widget.Button
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class testViewModel : ViewModel(){
    var num = 0
    val currentNumber: MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }
}