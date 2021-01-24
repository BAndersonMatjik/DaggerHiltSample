package com.bmajik.daggerhiltsample.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.bmajik.daggerhiltsample.data.IMainRepo

open class HomeViewModel @ViewModelInject constructor(val mainRepo: IMainRepo): ViewModel() {
    var title = mainRepo.getData()
}