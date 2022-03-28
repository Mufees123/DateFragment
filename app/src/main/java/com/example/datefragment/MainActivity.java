 package com.example.datefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

 public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t=findViewById(R.id.text);
        Button b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calender c=new Calender();
                c.show(getSupportFragmentManager(),"DOB");

            }
        });
    }

     @Override
     public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
     Calendar dob=Calendar.getInstance();
     dob.set(Calendar.YEAR,i);
     dob.set(Calendar.MONTH,i1);
     dob.set(Calendar.DATE,i2);
     String s= DateFormat.getDateInstance(DateFormat.FULL).format(dob.getTime());
     t.setText(s);
     }
 }