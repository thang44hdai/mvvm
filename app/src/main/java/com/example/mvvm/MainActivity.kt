package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: testViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvHienthi = findViewById<TextView>(R.id.tvHienthi)
        val btnIncrease = findViewById<Button>(R.id.btnCount)

        btnIncrease.setOnClickListener(){
            viewModel.currentNumber.value= ++viewModel.num
        }
        viewModel = ViewModelProvider(this).get(testViewModel::class.java)
        viewModel.currentNumber.observe(this, Observer {
            tvHienthi.text = it.toString()
        })
    }
}