package com.example.mdviewpagerandimageslideshowsectionproject;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlideShowAdapter slideShowAdapter;
    private CircleIndicator circleIndicator;

    // Timer related attributes
    private Handler handler;
    private Timer timer;

    private void initialise() {
        toolbar = findViewById(R.id.tool_bar);
        viewPager = findViewById(R.id.view_pager);
        slideShowAdapter = new SlideShowAdapter(this);
        circleIndicator = findViewById(R.id.circle_indicator);

        // Initialising Timer related attributes
        handler = new Handler();
        timer = new Timer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();

        setSupportActionBar(toolbar);

        viewPager.setAdapter(slideShowAdapter);

        circleIndicator.setViewPager(viewPager);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        viewPager.setCurrentItem(
                                (viewPager.getCurrentItem()+1)%slideShowAdapter.getCount(),
                                true);
                    }
                });
            }
        }, 2000, 2000);

        /* TODO :
        Learn how to pause the timer thread when the user manually tries to scroll the
        image front or back.
        */
    }
}