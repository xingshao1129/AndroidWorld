package com.example.mvvm.opengl2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mvvm.opengl2_0.day1.DisActivity;
import com.example.mvvm.opengl2_0.day2.ListActivity;
import com.example.mvvm.opengl2_0.day3.DisListActivity;
import com.example.mvvm.opengl2_0.day4.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.opengl_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, DisActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.opengl_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.opengl_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, DisListActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.opengl_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
