package com.example.hex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hex.ui.surveyform.SurveyFormFragment;

public class surveyForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_form_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, SurveyFormFragment.newInstance())
                    .commitNow();
        }
    }
}
