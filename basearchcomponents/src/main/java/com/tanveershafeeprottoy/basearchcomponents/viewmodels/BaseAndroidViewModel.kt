package com.tanveershafeeprottoy.basearchcomponents.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.tanveershafeeprottoy.basearchcomponents.interfaces.BaseViewModel
import com.tanveershafeeprottoy.basearchcomponents.livedata.SingleLiveEvent

abstract class BaseAndroidViewModel(application: Application) : AndroidViewModel(application), BaseViewModel {
    override val throwableSingleLiveEvent: SingleLiveEvent<Throwable?> = SingleLiveEvent()

    override fun throwError(throwable: Throwable?) {
        throwableSingleLiveEvent.value = throwable
    }
}