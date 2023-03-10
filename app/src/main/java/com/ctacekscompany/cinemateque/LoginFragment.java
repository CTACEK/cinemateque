package com.ctacekscompany.cinemateque;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ctacekscompany.cinemateque.databinding.FragmentMainBinding;


public class LoginFragment extends Fragment {

    private Context context;
    private final int duration = Toast.LENGTH_SHORT;

    private FragmentMainBinding binding;

    String clientName;
    private static final String TAG = "MainFragment";
    public LoginFragment() {
        super(R.layout.fragment_main);
    }



}