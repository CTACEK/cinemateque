package com.ctacekscompany.cinemateque;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    private final CharSequence createText = "Create toast!";
    private final CharSequence startText = "Start toast!";
    private final CharSequence stopText = "Stop toast!";
    private final CharSequence destroyText = "Destroy toast!";
    private final CharSequence pauseText = "Pause toast!";
    private final CharSequence resumeText = "Resume toast!";

    private final int duration = Toast.LENGTH_SHORT;
    private static final String TAG = "MyAPP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        Toast.makeText(context, createText, duration).show();
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