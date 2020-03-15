package com.example.hex.ui.aboutus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutusViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public AboutusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Aboutus fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
