package com.tanveershafeeprottoy.basearchcomponents.interfaces

import com.tanveershafeeprottoy.basearchcomponents.livedata.SingleLiveEvent

interface BaseViewModel {
    val throwableSingleLiveEvent: SingleLiveEvent<Throwable?>

    fun throwError(throwable: Throwable?)
}