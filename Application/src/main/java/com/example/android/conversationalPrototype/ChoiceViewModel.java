package com.example.android.conversationalPrototype;

import android.util.Log;
import android.view.View;

/**
 * Created by madde on 11/7/2017.
 */

public class ChoiceViewModel implements ActivityCallback {
    public static String TAG = "ChoiceViewModel";
    public ActivityCallback getActivityCallback() {
        return activityCallback;
    }

    private ActivityCallback activityCallback;

    public ChoiceViewModel(ActivityCallback callback) {
        Log.i(TAG, "ChoiceViewModel: constructor");
        this.activityCallback = callback;
    }

    @Override
    public void buttonClicked(View v) {
        Log.i(TAG, "buttonClicked: viewmodel");
        activityCallback.buttonClicked(v);
    }
}
