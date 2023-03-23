package com.arclightcreatives.basicapparchitecture

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var repository = Repository()
    val status = ObservableField<String>()

    fun onRefresh() {
        repository.onRefresh(object : Repodatacallback {
            override fun onRepodataready(data: String) {
                status.set(data)
            }
        })
    }

}