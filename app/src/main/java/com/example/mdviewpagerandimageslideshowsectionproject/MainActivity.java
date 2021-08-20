package com.example.mdviewpagerandimageslideshowsectionproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    private void initialise() {
        toolbar = findViewById(R.id.tool_bar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();
        setSupportActionBar(toolbar);
    }
}