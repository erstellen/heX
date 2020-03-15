package com.example.hex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hex.ui.aboutus.AboutusFragment;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AboutusFragment.newInstance())
                    .commitNow();
        }
    }
}
