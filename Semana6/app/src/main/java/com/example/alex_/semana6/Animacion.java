package com.example.alex_.semana6;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Animacion extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation);

        final ImageView image= (ImageView) findViewById(R.id.imageView);
        final ImageView image2= (ImageView) findViewById(R.id.imageView2);

        final Animation an =  AnimationUtils.loadAnimation(this, R.anim.scale);

        image.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {}
            public void onAnimationRepeat(Animation animation) {}
            public void onAnimationEnd(Animation animation) {
                image.startAnimation(an);
            }
        });
        Animation animation = new TranslateAnimation(Random(), Random(), Random(), Random());
        animation.setDuration(2000);
        animation.setFillAfter(false);
        image2.startAnimation(animation);
        animation.setRepeatCount(Animation.INFINITE);




    }

    public int Random(){

        Random r = new Random();
        int lowRange = -1500;
        int highRange = 1500;
        int result = r.nextInt(highRange -lowRange ) + lowRange ;
        return  result;
    }



}