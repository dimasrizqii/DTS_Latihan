package com.example.dts_latihan.ui.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivityKalkulatorBinding;
import com.example.dts_latihan.ui.MainActivity;

import java.util.Objects;

public class KalkulatorActivity extends AppCompatActivity {

    ActivityKalkulatorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        binding = ActivityKalkulatorBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnBack.setOnClickListener(this::goBack);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    public void goBack(View view) {
        Intent intent = new Intent(KalkulatorActivity.this, MainActivity.class);
        startActivity(intent);
    }
}