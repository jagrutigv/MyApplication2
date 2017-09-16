package marko.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class BookActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup radioGroup;
    Button pay,return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        //get the spinner from the xml.
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
//create a list of items for the spinner.
        String[] items = new String[]{"Mumbai Central", "Ram Mandir", "khar"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);

        pay=(Button)findViewById(R.id.pay);
        pay.setOnClickListener(this);
        return1=(Button)findViewById(R.id.return1);
        return1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,Payment.class);
        startActivity(i);
    }
}