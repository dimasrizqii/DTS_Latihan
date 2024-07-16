package com.example.dts_latihan.ui.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dts_latihan.R;
import com.example.dts_latihan.databinding.ActivityListViewBinding;

public class ListViewActivity extends AppCompatActivity {

    ActivityListViewBinding binding;

    String[] country = {"Indonesia", "Malaysia", "Philippines", "Myanmar",
            "Vietnam", "Brunei Darussalam", "Cambodia", "Laos"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ListView listview = binding.listview;

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, country);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener((adapterView, view1, i, l) -> {
            if(i==0){
                Toast.makeText(getApplicationContext(), "Indonesia", Toast.LENGTH_SHORT).show();
            } else if (i==1) {
                Toast.makeText(getApplicationContext(), "Malaysia", Toast.LENGTH_SHORT).show();
            } else if (i==2) {
                Toast.makeText(getApplicationContext(), "Philippines", Toast.LENGTH_SHORT).show();
            } else if (i==3) {
                Toast.makeText(getApplicationContext(), "Myanmar", Toast.LENGTH_SHORT).show();
            } else if (i==4) {
                Toast.makeText(getApplicationContext(), "Vietnam", Toast.LENGTH_SHORT).show();
            } else if (i==5) {
                Toast.makeText(getApplicationContext(), "Brunei Darussalam", Toast.LENGTH_SHORT).show();
            } else if (i==6) {
                Toast.makeText(getApplicationContext(), "Cambodia", Toast.LENGTH_SHORT).show();
            } else if (i==7) {
                Toast.makeText(getApplicationContext(), "Laos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}