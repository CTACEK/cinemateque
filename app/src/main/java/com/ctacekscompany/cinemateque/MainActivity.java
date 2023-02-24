package com.ctacekscompany.cinemateque;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
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

    private final int duration = Toast.LENGTH_SHORT;
    private static final String TAG = "MyAPP";

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

//        button = findViewById(R.id.button);
//
//        button.setOnClickListener(v -> Log.d(TAG, "Client click me!")
//        );



        Toast.makeText(context, createText, duration).show();
    }

    public void onMyButtonClick(View view)
    {
        Log.d(TAG, "Client click me!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(context, startText, duration).show();
        Log.i(TAG, String.valueOf(startText));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(context, stopText, duration).show();
        Log.d(TAG, String.valueOf(stopText));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(context, destroyText, duration).show();
        Log.e(TAG, String.valueOf(destroyText));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(context, pauseText, duration).show();
        Log.v(TAG, String.valueOf(pauseText));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(context, resumeText, duration).show();
        Log.w(TAG, String.valueOf(resumeText));
    }

}