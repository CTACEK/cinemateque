package com.ctacekscompany.cinemateque;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ctacekscompany.cinemateque.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view, MainFragment.class, null)
                .commit();
    }
}