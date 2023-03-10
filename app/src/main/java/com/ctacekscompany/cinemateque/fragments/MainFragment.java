package com.ctacekscompany.cinemateque.fragments;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.ctacekscompany.cinemateque.data.FilmAdapter;
import com.ctacekscompany.cinemateque.data.FilmInfo;
import com.ctacekscompany.cinemateque.R;
import com.ctacekscompany.cinemateque.data.FilmRecycleAdapter;
import com.ctacekscompany.cinemateque.databinding.FragmentMainBinding;

import java.util.ArrayList;


public class MainFragment extends Fragment {

    private Context context;
    private final int duration = Toast.LENGTH_SHORT;

    private FragmentMainBinding binding;
    private ListView filmsList;

    private String clientName;

    private ArrayList<FilmInfo> films;
    private static final String TAG = "MainFragment";

    public MainFragment() {
        super(R.layout.fragment_main);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        Toast.makeText(context, "onCreateView", duration).show();
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @SuppressLint({"SetTextI18n", "UseCompatLoadingForDrawables"})
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onViewCreated");
        Toast.makeText(context, "onViewCreated", duration).show();

        clientName = "Noname";

        binding.textView.setText(getString(R.string.hello_client) + clientName);

        getParentFragmentManager().setFragmentResultListener("requestKey", this, (key, bundle) -> {
            String result = bundle.getString("bundleKey");
            binding.textView.setText(getString(R.string.hello_client) + result);
        });

        binding.button.setOnClickListener(v ->
                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container_view,
                        SettingsFragment.class, null).commit());
        binding.button2.setOnClickListener(v ->
                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container_view,
                        LoginFragment.class, null).commit());

        films = new ArrayList<>();


        RecyclerView recyclerView = view.findViewById(R.id.list);

        FilmRecycleAdapter adapter = new FilmRecycleAdapter(getContext(), createRandomList(200));
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<FilmInfo> createRandomList(int count) {
        ArrayList<FilmInfo> randomFilms = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            randomFilms.add(new FilmInfo("Avatar " + i, R.drawable.man));
        }
        return randomFilms;
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