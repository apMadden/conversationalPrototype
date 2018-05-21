package com.example.android.conversationalPrototype;

import android.databinding.ObservableBoolean;
import android.util.Log;
import android.view.View;

/**
 * Created by madde on 11/7/2017.
 */

public class CameraFragmentViewModel implements ActivityCallback {
    public static String TAG = "CameraFragmentViewModel";
    public ActivityCallback getActivityCallback() {
        return activityCallback;
    }

    public ObservableBoolean isHidden = new ObservableBoolean(true);

    private ActivityCallback activityCallback;

    public CameraFragmentViewModel(ActivityCallback callback) {
        Log.i(TAG, "ChoiceViewModel: constructor");
        this.activityCallback = callback;
    }

    @Override
    public void buttonClicked(View v) {
        Log.i(TAG, "buttonClicked: viewmodel");
        activityCallback.buttonClicked(v);
    }
}