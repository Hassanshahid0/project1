package com.example.dailogbox;

import static com.example.dailog_box.Dailog1.Simple_Dailog_Box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.example.dailog_box.Dailog1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Simple_Dailog_Box(this,"hi");
    }
}