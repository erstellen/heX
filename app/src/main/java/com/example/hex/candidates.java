package com.example.hex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hex.ui.candidates.CandidatesFragment;

public class candidates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidates_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CandidatesFragment.newInstance())
                    .commitNow();
        }
    }
}
