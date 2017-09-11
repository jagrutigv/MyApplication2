package marko.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class splash extends AppCompatActivity {
private static int splash_time_out=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_animation);
                animation.setAnimationListener(new Animation.AnimationListener(){
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent homeIntent = new Intent(splash.this, MainActivity.class);
                        startActivity(homeIntent);
                        finish();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }


                });

            }
        },splash_time_out);
    }
}
