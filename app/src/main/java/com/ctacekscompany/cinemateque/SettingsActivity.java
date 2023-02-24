package com.ctacekscompany.cinemateque;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ctacekscompany.cinemateque.databinding.ActivityMainBinding;
import com.ctacekscompany.cinemateque.databinding.ActivitySettingsBinding;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySettingsBinding binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {
                Intent data = new Intent();
                data.putExtra(MainActivity.ACCESS_MESSAGE, binding.editTextPersonName.getText().toString());
                setResult(RESULT_OK, data);
                finish();
        });


        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();

        binding.editTextPersonName.setText(name);
    }
}