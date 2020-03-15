package com.example.hex.ui.ward;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WardViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public WardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ward fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
