package com.tanveershafeeprottoy.basearchcomponents.viewmodels

import androidx.lifecycle.ViewModel
import com.tanveershafeeprottoy.basearchcomponents.interfaces.BaseViewModel
import com.tanveershafeeprottoy.basearchcomponents.livedata.SingleLiveEvent

abstract class BaseViewModel : ViewModel(), BaseViewModel {
    override val throwableSingleLiveEvent: SingleLiveEvent<Throwable?> = SingleLiveEvent()

    override fun throwError(throwable: Throwable?) {
        throwableSingleLiveEvent.value = throwable
    }
}