package com.ctacekscompany.cinemateque.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ctacekscompany.cinemateque.R;
import com.ctacekscompany.cinemateque.databinding.FragmentSettingsBinding;


public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;

    private Context context;
    private final int duration = Toast.LENGTH_SHORT;

    private static final String TAG = "SettingsFragment";

    public SettingsFragment() {
        super(R.layout.fragment_settings);
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        Log.d(TAG, "onCreateView");
        Toast.makeText(context, "onCreateView", duration).show();
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        Toast.makeText(context, "onViewCreated", duration).show();
        binding.backButton.setOnClickListener(v -> {
            Bundle result = new Bundle();
            result.putString("bundleKey", String.valueOf(binding.editTextPersonName.getText()));
            getParentFragmentManager().setFragmentResult("requestKey", result);

            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container_view, MainFragment.class, null).commit();
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView");
        Toast.makeText(context, "onDestroyView", duration).show();
        binding = null;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
        Log.d(TAG, "onCreate");
        Toast.makeText(context, "onCreate", duration).show();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated");
        Toast.makeText(context, "onActivityCreated", duration).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(context, "onStart", duration).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(context, "onResume", duration).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(context, "onPause", duration).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(context, "onStop", duration).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(context, "onDestroy", duration).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");
        Toast.makeText(context, "onDetach", duration).show();
    }
}