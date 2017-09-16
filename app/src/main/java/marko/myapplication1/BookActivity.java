package marko.myapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class BookActivity extends AppCompatActivity {
    private View v;
    Spinner spnto = (Spinner) v.findViewById(R.id.spn_to);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        spnto = (Spinner) v.findViewById(R.id.spn_to);
        List<String> list = new ArrayList<String>();
        list.add("To");
        list.add("Mumbai Central ");
        list.add("Khar");
        list.add("Cotton Green");
        list.add("Ram Mandir");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnto.setAdapter(dataAdapter);
    }
}
