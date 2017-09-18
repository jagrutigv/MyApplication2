package marko.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btn=(Button)findViewById(R.id.proceed1);
      btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i=new Intent(Payment.this,Ticket.class);
        startActivity(i);
    }
}
