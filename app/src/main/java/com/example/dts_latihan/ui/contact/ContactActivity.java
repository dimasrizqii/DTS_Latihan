package com.example.dts_latihan.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivityContactBinding;
import com.example.dts_latihan.ui.MainActivity;

import java.util.Objects;

public class ContactActivity extends AppCompatActivity {

    private ActivityContactBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contact);

        binding = ActivityContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnBack.setOnClickListener(this::goBack);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    public void goBack(View view) {
        Intent intent = new Intent(ContactActivity.this, MainActivity.class);
        startActivity(intent);
    }


}