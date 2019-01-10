package com.tanveershafeeprottoy.basearchcomponents.viewmodels;

import com.tanveershafeeprottoy.basearchcomponents.livedata.SingleLiveEvent;

import androidx.lifecycle.ViewModel;

/**
 * @author Tanveer Shafee Prottoy
 */
public abstract class BaseViewModel extends ViewModel {
    protected SingleLiveEvent<Throwable> throwableSingleLiveEvent = new SingleLiveEvent<>();

    protected void throwError(Throwable throwable) {
        throwableSingleLiveEvent.setValue(throwable);
    }
}
