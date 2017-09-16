package marko.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
TextView txt1;
Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        btn=(Button)findViewById(R.id.login);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,BookActivity.class);
        startActivity(i);
    }
}