package marko.myapplication1;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
public static final int Request_code=100;
    public static final int Permission=100;
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
        if(ContextCompat.checkSelfPermission(LoginActivity.this, Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED){
           // ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},);
        }
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
       /* IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setPrompt("Scan a Aadharcard QR Code");
        integrator.setResultDisplayDuration(500);
        integrator.setCameraId(0); // Use a specific camera of the device
        integrator.initiateScan();*/
       Intent intent=new Intent(this,MainActivity.class);
        startActivityForResult(intent,Request_code);

    }

}