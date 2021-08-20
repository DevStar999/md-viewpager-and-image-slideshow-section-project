package com.example.mdviewpagerandimageslideshowsectionproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlideShowAdapter slideShowAdapter;

    private void initialise() {
        toolbar = findViewById(R.id.tool_bar);
        viewPager = findViewById(R.id.view_pager);
        slideShowAdapter = new SlideShowAdapter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();

        setSupportActionBar(toolbar);

        viewPager.setAdapter(slideShowAdapter);
    }
}