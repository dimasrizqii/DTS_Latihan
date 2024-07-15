package com.example.dts_latihan.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivityMainBinding;
import com.example.dts_latihan.ui.input_nama.InputNamaActivity;
import com.example.dts_latihan.ui.kalkulator.KalkulatorActivity;
import com.example.dts_latihan.ui.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String name;

    boolean isGray = false;
    boolean isFilled = false;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnClick.setOnClickListener(view1 -> {
            name = binding.etName.getText().toString();
            if(name.isEmpty()) {
                Toast.makeText(this, "Isi dulu bang namanya", Toast.LENGTH_SHORT).show();
            } else if(isFilled) {
                binding.tvSurprise.setVisibility(View.GONE);
                isFilled = false;
                binding.btnClick.setText("Click it!");
            } else {
                binding.tvSurprise.setText("My name is " + name);
                binding.tvSurprise.setVisibility(View.VISIBLE);
                isFilled = true;
                binding.btnClick.setText("Reset");
            }
        });

        binding.btnChangeColor.setOnClickListener(view1 -> {
            if(!isGray) {
                binding.btnChangeColor.setBackgroundColor(Color.GRAY);
                isGray = true;
            } else {
                binding.btnChangeColor.setBackgroundColor(Color.parseColor("#FFBB86FC"));
                isGray = false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.input_nama) {
            Intent intent = new Intent(MainActivity.this, InputNamaActivity.class);
            startActivity(intent);

            return true;

        } else if (id == R.id.kalkulator) {
            Intent intent = new Intent(MainActivity.this, KalkulatorActivity.class);
            startActivity(intent);

            return true;
        } else {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            startActivity(intent);

            return true;
        }
    }
}