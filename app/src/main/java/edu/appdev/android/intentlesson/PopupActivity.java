package edu.appdev.android.intentlesson;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Jordan on 12/11/2016.
 */

public class PopupActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        TextView txt = (TextView) findViewById(R.id.text);
        txt.setText("Hi " + name);
    }
}
