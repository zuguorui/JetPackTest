package com.zu.jetpacktest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel()
{
    val user: MutableLiveData<User> by lazy {
        MutableLiveData<User>()
    }
}