package marko.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button scanBtn;
    private Button scanButton;
    public TextView resultTextView;
    String uid,name,gender,yearOfBirth,careOf,villageTehsil,postOffice,district,state,postCode;
    TextView tv_sd_uid,tv_sd_name,tv_sd_gender,tv_sd_yob,tv_sd_co,tv_sd_vtc,tv_sd_po,tv_sd_dist,
            tv_sd_state,tv_sd_pc,tv_cancel_action;
    public void init() {
       Button scanButton = (Button) findViewById(R.id.scan_code);
        scanButton.setOnClickListener(this);
       resultTextView = (TextView) findViewById(R.id.text);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(scanResult != null) {
            JSONObject
            Log.i("SCAN", "scan result: " + scanResult);
            resultTextView.setText(scanResult.toString());
            Log.v("barcode", scanResult.getContents().toString());
            //String shareFact = resultTextView.getText().toString();
        } else
            Log.e("SCAN", "Sorry, the scan was unsuccessful...");
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.scan_code) {
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


