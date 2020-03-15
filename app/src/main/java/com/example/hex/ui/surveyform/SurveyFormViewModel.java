package com.example.hex.ui.surveyform;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SurveyFormViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public SurveyFormViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is survey fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
