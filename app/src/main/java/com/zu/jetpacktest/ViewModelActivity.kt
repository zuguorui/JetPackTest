package com.zu.jetpacktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.zu.jetpacktest.databinding.ActivityViewModelBinding
import kotlin.random.Random

class ViewModelActivity : AppCompatActivity() {

    var lifeCycleObserver: MyLifeCycleObserver = MyLifeCycleObserver(ViewModelActivity::class.java.simpleName)
    lateinit var mBinding: ActivityViewModelBinding
    lateinit var model: UserViewModel
    var user = User("Jone", 10)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_model)
        mBinding.eventHandler = this
        lifecycle.addObserver(lifeCycleObserver)
//        model = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(UserViewModel::class.java)
        model = ViewModelProviders.of(this).get(UserViewModel::class.java)

        val userObserver = Observer<User>{
            mBinding.tvName.text = it.name
            mBinding.tvAge.text = "${it.age}"
        }

        model.user.observe(this, userObserver)

        model.user.value = user


    }

    fun newUser()
    {
        user.name = "ss"
        user.age++
        model.user.value = user
    }
}
