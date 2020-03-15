package com.example.hex.ui.candidates;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CandidatesViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public CandidatesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is candidates fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
