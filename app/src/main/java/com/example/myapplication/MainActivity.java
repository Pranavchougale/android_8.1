package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    DatePicker dt1;
    Button bt1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dt1=findViewById(R.id.datePicker1);
        tv1=findViewById(R.id.textView1);
        bt1=findViewById(R.id.btn1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Selected Date: "+ dt1.getDayOfMonth()+"/"+ (dt1.getMonth() + 1)+"/"+dt1
                        .getYear());            }
        });
    }
}