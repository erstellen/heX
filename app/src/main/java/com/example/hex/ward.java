package com.example.hex;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hex.ui.ward.WardFragment;

public class ward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ward_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, WardFragment.newInstance())
                    .commitNow();
        }
    }
}
