package marko.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button scanButton;
    EditText et_pass;
    public TextView txt;

    public void init() {
        scanButton = (Button) findViewById(R.id.scan_code);
        scanButton.setOnClickListener(this);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (scanResult != null) {
           Intent intent=new Intent(this,Registration.class);
            startActivity(intent);
        } else
            Log.e("SCAN", "Sorry, the scan was unsuccessful...");
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.scan_code) {
            // start scanning
            IntentIntegrator intentIntegrator = new IntentIntegrator(this);
            intentIntegrator.initiateScan();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}




