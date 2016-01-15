package com.example.lindsay.whiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {

        EditText billEntry = (EditText) findViewById(R.id.billAmount);
        double bill = Double.parseDouble(billEntry.getText().toString());
        double percent = 0.2;
        double tip = bill * percent;

        TextView tipEntry = (TextView) findViewById(R.id.tipAmount);
        tipEntry.setText("$" + String.format("%.2f", tip));

    }
}
