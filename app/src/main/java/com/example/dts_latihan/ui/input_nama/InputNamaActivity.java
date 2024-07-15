package com.example.dts_latihan.ui.input_nama;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivityInputNamaBinding;
import com.example.dts_latihan.ui.MainActivity;

import java.util.Objects;

public class InputNamaActivity extends AppCompatActivity {

    private ActivityInputNamaBinding binding;
    private String name;

    boolean isFilled = false;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);

        binding = ActivityInputNamaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnSubmit.setOnClickListener(view1 -> {
            name = binding.etInputNama.getText().toString();
            if(name.isEmpty()) {
                Toast.makeText(this, "Isi dulu bang namanya", Toast.LENGTH_SHORT).show();
            } else if(isFilled) {
                binding.tvInputNama.setVisibility(View.GONE);
                isFilled = false;
                binding.btnSubmit.setText("Tampilkan");
            } else {
                binding.tvInputNama.setText("Nama Anda : " + name);
                binding.tvInputNama.setVisibility(View.VISIBLE);
                isFilled = true;
                binding.btnSubmit.setText("Reset");
            }
        });

        binding.btnBack.setOnClickListener(this::goBack);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    public void goBack(View view) {
        Intent intent = new Intent(InputNamaActivity.this, MainActivity.class);
        startActivity(intent);
    }
}