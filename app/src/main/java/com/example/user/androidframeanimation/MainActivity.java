package com.example.user.androidframeanimation;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    ImageView truck_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout=(FrameLayout)findViewById(R.id.framelayout);
        truck_logo=(ImageView)findViewById(R.id.image_truck);
        setAnimation();
    }

    private void setAnimation() {
        TranslateAnimation animation = new TranslateAnimation(00.0f, -300.0f,
                0.0f, 0.0f);
        animation.setDuration(4000);
        animation.setRepeatMode(2);
        animation.setFillAfter(true);
        frameLayout.startAnimation(animation);

        TranslateAnimation truck_log_animation = new TranslateAnimation(00.0f, 600.0f,
                0.0f, 0.0f);
        truck_log_animation.setDuration(4000);
        truck_log_animation.setRepeatMode(2);
        truck_log_animation.setFillAfter(true);
        truck_logo.startAnimation(truck_log_animation);
    }
}
