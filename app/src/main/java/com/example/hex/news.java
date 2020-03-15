package com.example.hex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hex.ui.news.NewsFragment;

public class news extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NewsFragment.newInstance())
                    .commitNow();
        }
    }
}
