package com.zu.jetpacktest

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyLifeCycleObserver(val ownerName: String): LifecycleObserver
{
    companion object val TAG: String = "MyLifecycleObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun ownerCreate()
    {
        Log.d(TAG, "$ownerName create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun ownerStart()
    {
        Log.d(TAG, "$ownerName start")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun ownerResume()
    {
        Log.d(TAG, "$ownerName resume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun ownerPause()
    {
        Log.d(TAG, "$ownerName pause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun ownerStop()
    {
        Log.d(TAG, "$ownerName stop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun ownerDestroy()
    {
        Log.d(TAG, "$ownerName destroy")
    }


}