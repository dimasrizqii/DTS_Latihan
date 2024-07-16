package com.example.dts_latihan.ui.kalkulator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivityKalkulatorBinding;
import com.example.dts_latihan.ui.MainActivity;

import java.util.Objects;

public class KalkulatorActivity extends AppCompatActivity {

    ActivityKalkulatorBinding binding;

    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        binding = ActivityKalkulatorBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnTambah.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText number1 = binding.etAngkaPertama;
                EditText number2 = binding.etAngkaKedua;
                if (number1.getText().toString().trim().isEmpty() && number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else if (number1.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka pertama", Toast.LENGTH_SHORT).show();
                }  else if (number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka kedua", Toast.LENGTH_SHORT).show();
                } else {
                    a = Integer.parseInt(number1.getText().toString());
                    b = Integer.parseInt(number2.getText().toString());
                    binding.tvHasilAngka.setText("" + (a+b));
                }
            }
        });

        binding.btnKurang.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText number1 = binding.etAngkaPertama;
                EditText number2 = binding.etAngkaKedua;
                if (number1.getText().toString().trim().isEmpty() && number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else if (number1.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka pertama", Toast.LENGTH_SHORT).show();
                }  else if (number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka kedua", Toast.LENGTH_SHORT).show();
                } else {
                    a = Integer.parseInt(number1.getText().toString());
                    b = Integer.parseInt(number2.getText().toString());
                    binding.tvHasilAngka.setText("" + (a-b));
                }
            }
        });

        binding.btnKali.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText number1 = binding.etAngkaPertama;
                EditText number2 = binding.etAngkaKedua;
                if (number1.getText().toString().trim().isEmpty() && number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else if (number1.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka pertama", Toast.LENGTH_SHORT).show();
                }  else if (number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka kedua", Toast.LENGTH_SHORT).show();
                } else {
                    a = Integer.parseInt(number1.getText().toString());
                    b = Integer.parseInt(number2.getText().toString());
                    binding.tvHasilAngka.setText("" + a*b);
                }
            }
        });

        binding.btnBagi.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText number1 = binding.etAngkaPertama;
                EditText number2 = binding.etAngkaKedua;
                if (number1.getText().toString().trim().isEmpty() && number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else if (number1.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka pertama", Toast.LENGTH_SHORT).show();
                }  else if (number2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan angka kedua", Toast.LENGTH_SHORT).show();
                } else {
                    a = Integer.parseInt(number1.getText().toString());
                    b = Integer.parseInt(number2.getText().toString());
                    binding.tvHasilAngka.setText("" + a/b);
                }
            }
        });
        
        binding.btnBersihkan.setOnClickListener(this::resetNumber);

        binding.btnBack.setOnClickListener(this::goBack);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    private void resetNumber(View view) {
        binding.tvHasilAngka.setText("0");
    }


    public void goBack(View view) {
        Intent intent = new Intent(KalkulatorActivity.this, MainActivity.class);
        startActivity(intent);
    }
}