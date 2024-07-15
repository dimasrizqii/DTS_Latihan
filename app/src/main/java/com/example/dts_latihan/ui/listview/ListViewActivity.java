package com.example.dts_latihan.ui.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }
}