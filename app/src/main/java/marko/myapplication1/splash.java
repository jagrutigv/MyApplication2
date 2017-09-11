package marko.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splash extends AppCompatActivity {
private static int splash_time_out=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent homeIntent = new Intent(splash.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },splash_time_out);
    }
}
