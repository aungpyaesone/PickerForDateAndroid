package com.example.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDate = findViewById(R.id.btnDate);

    }

    public void showDatePicker(View view) {
        DialogFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void processDatePicker(int year,int month,int day){
        String year_string = Integer.toString(year);
        String month_string = Integer.toString(month);
        String day_string = Integer.toString(day);
        String dateMessage = month_string+ "/" + day_string + "/" + year_string;
        Toast.makeText(this, "Date "+ dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void showTimePicker(View view) {
        DialogFragment timePickerFragment = new TimePickerFragment();
        timePickerFragment.show(getSupportFragmentManager(),"timePicker");

    }

    public void processTimePicker(int hour,int minute){
        String hour_string = Integer.toString(hour);
        String minute_string = Integer.toString(minute);
        String dataMessage = hour_string + ":" + minute_string;
        Toast.makeText(this, "Time "+ dataMessage, Toast.LENGTH_SHORT).show();

    }
}
