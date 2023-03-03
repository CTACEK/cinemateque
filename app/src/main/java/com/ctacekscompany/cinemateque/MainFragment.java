package com.ctacekscompany.cinemateque;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ctacekscompany.cinemateque.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {

//    private Context context;
//
//    private final CharSequence createText = "Create toast!";
//    private final CharSequence startText = "Start toast!";
//    private final CharSequence stopText = "Stop toast!";
//    private final CharSequence destroyText = "Destroy toast!";
//    private final CharSequence pauseText = "Pause toast!";
//    private final CharSequence resumeText = "Resume toast!";

    private FragmentMainBinding binding;

    String clientName;
//    private final int duration = Toast.LENGTH_SHORT;
//    private static final String TAG = "MyAPP";
//
//    static final String ACCESS_MESSAGE = "ACCESS_MESSAGE";

    public MainFragment() {
        super(R.layout.fragment_main);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @SuppressLint({"SetTextI18n", "UseCompatLoadingForDrawables"})
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        clientName = " Noname";

        binding.textView.setText(getString(R.string.hello_client) + clientName);


        binding.button.setOnClickListener(v -> getParentFragmentManager().beginTransaction().replace(R.id.fragment_container_view, SettingsFragment.class, null).commit());

        binding.imageView1.setImageDrawable(getResources().getDrawable(R.drawable.man));
        binding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.man));
        binding.imageView3.setImageDrawable(getResources().getDrawable(R.drawable.man));
        binding.imageView4.setImageDrawable(getResources().getDrawable(R.drawable.man));
        binding.imageView5.setImageDrawable(getResources().getDrawable(R.drawable.man));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}