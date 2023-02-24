package com.ctacekscompany.cinemateque;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.ctacekscompany.cinemateque.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private Context context;

    private final CharSequence createText = "Create toast!";
    private final CharSequence startText = "Start toast!";
    private final CharSequence stopText = "Stop toast!";
    private final CharSequence destroyText = "Destroy toast!";
    private final CharSequence pauseText = "Pause toast!";
    private final CharSequence resumeText = "Resume toast!";

    FloatingActionButton button;

    String clientName;
    private final int duration = Toast.LENGTH_SHORT;
    private static final String TAG = "MyAPP";

    static final String ACCESS_MESSAGE="ACCESS_MESSAGE";

    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onActivityResult(ActivityResult result) {

                    TextView textView = findViewById(R.id.textView);
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent intent = result.getData();
                        assert intent != null;
                        String nameClient = intent.getStringExtra(ACCESS_MESSAGE);
                        clientName = nameClient;
                        textView.setText(getString(R.string.hello_client) + nameClient);
                    }
                    else{
                        Toast.makeText(context, "Настройки не были сохранены!", duration).show();
                    }
                }
            });

    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        context = getApplicationContext();

        clientName = "Dear client";

        binding.textView.setText(getString(R.string.hello_client) + clientName);

        binding.button.setOnClickListener(v -> {
            Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
            settingsIntent.putExtra("name", clientName);
            mStartForResult.launch(settingsIntent);
        });

        binding.imageView1.setImageDrawable(getDrawable(R.drawable.man));
        binding.imageView2.setImageDrawable(getDrawable(R.drawable.man));
        binding.imageView3.setImageDrawable(getDrawable(R.drawable.man));
        binding.imageView4.setImageDrawable(getDrawable(R.drawable.man));
        binding.imageView5.setImageDrawable(getDrawable(R.drawable.man));

//        Toast.makeText(context, createText, duration).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Toast.makeText(context, startText, duration).show();
        Log.i(TAG, String.valueOf(startText));
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Toast.makeText(context, stopText, duration).show();
        Log.d(TAG, String.valueOf(stopText));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Toast.makeText(context, destroyText, duration).show();
        Log.e(TAG, String.valueOf(destroyText));
    }

    @Override
    protected void onPause() {
        super.onPause();
//        Toast.makeText(context, pauseText, duration).show();
        Log.v(TAG, String.valueOf(pauseText));
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(context, resumeText, duration).show();
        Log.w(TAG, String.valueOf(resumeText));
    }

}