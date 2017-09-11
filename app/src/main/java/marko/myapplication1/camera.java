package marko.myapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class camera extends AppCompatActivity {
    TextView tv_sd_uid,tv_sd_name,tv_sd_gender,tv_sd_yob,tv_sd_co,tv_sd_vtc,tv_sd_po,tv_sd_dist,
            tv_sd_state,tv_sd_year,tv_sd_dob, tv_sd_pc,tv_sd_subdist,tv_street;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        tv_sd_po = (TextView) findViewById(R.id.po);
        tv_sd_vtc = (TextView) findViewById(R.id.vtc);
        tv_sd_gender = (TextView) findViewById(R.id.gender);
        tv_sd_state = (TextView) findViewById(R.id.state);
        tv_sd_pc = (TextView) findViewById(R.id.pc);
        tv_sd_co = (TextView) findViewById(R.id.co);
        tv_sd_dist = (TextView) findViewById(R.id.dist);
        tv_sd_dob = (TextView) findViewById(R.id.dob);
        tv_sd_name = (TextView) findViewById(R.id.name);
        tv_sd_subdist = (TextView) findViewById(R.id.subdist);
        tv_sd_uid = (TextView) findViewById(R.id.uid);
        tv_street = (TextView) findViewById(R.id.street);
        tv_sd_yob = (TextView) findViewById(R.id.yob);
        tv_sd_year = (TextView) findViewById(R.id.year);
    }

    }

