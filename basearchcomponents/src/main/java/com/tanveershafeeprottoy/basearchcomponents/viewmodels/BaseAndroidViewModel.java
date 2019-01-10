package com.tanveershafeeprottoy.basearchcomponents.viewmodels;

import android.app.Application;

import com.tanveershafeeprottoy.basearchcomponents.livedata.SingleLiveEvent;

import androidx.lifecycle.AndroidViewModel;

/**
 * @author Tanveer Shafee Prottoy
 */
public abstract class BaseAndroidViewModel extends AndroidViewModel {
    protected SingleLiveEvent<Throwable> throwableSingleLiveEvent = new SingleLiveEvent<>();

    public BaseAndroidViewModel(Application application) {
        super(application);
    }

    protected void throwError(Throwable throwable) {
        throwableSingleLiveEvent.setValue(throwable);
    }
}
