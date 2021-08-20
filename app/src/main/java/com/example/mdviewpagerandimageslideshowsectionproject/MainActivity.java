package com.example.mdviewpagerandimageslideshowsectionproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlideShowAdapter slideShowAdapter;
    private CircleIndicator circleIndicator;

    private void initialise() {
        toolbar = findViewById(R.id.tool_bar);
        viewPager = findViewById(R.id.view_pager);
        slideShowAdapter = new SlideShowAdapter(this);
        circleIndicator = findViewById(R.id.circle_indicator);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();

        setSupportActionBar(toolbar);

        viewPager.setAdapter(slideShowAdapter);

        circleIndicator.setViewPager(viewPager);
    }
}