package com.example.dts_latihan.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivityProfileBinding;
import com.example.dts_latihan.ui.MainActivity;
import com.example.dts_latihan.ui.contact.ContactActivity;

import java.util.Objects;

public class ProfileActivity extends AppCompatActivity {

    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnBack.setOnClickListener(this::goBack);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    public void goBack(View view) {
        Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(intent);
    }
}