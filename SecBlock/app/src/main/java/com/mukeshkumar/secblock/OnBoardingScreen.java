package com.mukeshkumar.secblock;


import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class OnBoardingScreen extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dotsLayout;
    SliderAdapter sliderAdapter;
    TextView[] dots;
    Button letsGetStarted, skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);

        viewPager = findViewById(R.id.slider);
        dotsLayout = findViewById(R.id.dots);
        letsGetStarted = findViewById(R.id.get_started_button);
        skip = findViewById(R.id.skip);
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);
    }

    public void skip(View view){
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public void getStarted(View view){
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }


    private void addDots(int position) {
        dots = new TextView[5];
        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);

            dotsLayout.addView(dots[i]);
        }
        if (dots.length > 0) {
            dots[position].setTextColor(getResources().getColor(R.color.primary_color));
        }
    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
            if (position == 0) {
                letsGetStarted.setVisibility(View.INVISIBLE);
                skip.setVisibility(View.VISIBLE);
                dotsLayout.setVisibility(View.VISIBLE);
            } else if (position == 1) {
                letsGetStarted.setVisibility(View.INVISIBLE);
                skip.setVisibility(View.VISIBLE);
                dotsLayout.setVisibility(View.VISIBLE);
            } else if (position == 2) {
                letsGetStarted.setVisibility(View.INVISIBLE);
                skip.setVisibility(View.VISIBLE);
                dotsLayout.setVisibility(View.VISIBLE);
            } else if (position == 3) {
                letsGetStarted.setVisibility(View.INVISIBLE);
                skip.setVisibility(View.VISIBLE);
                dotsLayout.setVisibility(View.VISIBLE);
            } else {
                letsGetStarted.setVisibility(View.VISIBLE);
                dotsLayout.setVisibility(View.INVISIBLE);
                skip.setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}