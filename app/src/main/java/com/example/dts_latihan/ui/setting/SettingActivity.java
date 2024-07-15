package com.example.dts_latihan.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivitySettingBinding;
import com.example.dts_latihan.ui.MainActivity;
import com.example.dts_latihan.ui.contact.ContactActivity;

import java.util.Objects;

public class SettingActivity extends AppCompatActivity {

    private ActivitySettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnBack.setOnClickListener(this::goBack);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    public void goBack(View view) {
        Intent intent = new Intent(SettingActivity.this, MainActivity.class);
        startActivity(intent);
    }
}