package marko.myapplication1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static boolean hasLoggedIn;
    public static SharedPreferences settings;
    EditText et_num, et_pass;
    String strUrl, adharnum, password, ans;
    private static final String PREFS_NAME = "Login";
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        Button btn=(Button)findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,SigninActivity.class);
                startActivity(i);
            }
        });
        Button button1 = (Button) findViewById(R.id.signin);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,SigninActivity.class);
        startActivity(i);
    }
}