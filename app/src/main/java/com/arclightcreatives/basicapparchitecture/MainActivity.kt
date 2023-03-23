package com.arclightcreatives.basicapparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.arclightcreatives.basicapparchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var viewModel = MainViewModel()

        // Binding value directly
        activityMainBinding.apply {
            name.text = "Roshin"
            phoneno.text = "9901810196"
            catagory.text = "books"
        }

        // Data Binding
        activityMainBinding.viewmodel = viewModel
        activityMainBinding.executePendingBindings()

    }
}