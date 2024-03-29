package edu.appdev.android.intentlesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchIntent(View v) {
        final Intent intent = new Intent(this, PopupActivity.class);
        intent.putExtra(PopupActivity.EXTRA_NAME, "Larry");
        startActivity(intent);
    }
}
