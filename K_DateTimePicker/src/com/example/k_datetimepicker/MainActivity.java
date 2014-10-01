package com.example.k_datetimepicker;

import java.util.Calendar;

import android.support.v7.app.ActionBarActivity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends ActionBarActivity {

	TextView tvDate, tvTime;
	Button btnDate, btnTime;
	
	int day, month, date, year;
	int hr, min;
	
	int dateInfo = 11, timeInfo = 22;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    
    tvDate = (TextView) findViewById(R.id.txtDate);
    tvTime = (TextView) findViewById(R.id.txtTime);
    btnDate = (Button) findViewById(R.id.btnDate);
    btnTime = (Button) findViewById(R.id.btnTime);
    
    Calendar cal = Calendar.getInstance();
    
    day = cal.get(Calendar.DAY_OF_WEEK);
    month = cal.get(Calendar.MONTH);
    date = cal.get(Calendar.DAY_OF_MONTH);
    year = cal.get(Calendar.YEAR);
    
    hr = cal.get(Calendar.HOUR_OF_DAY);
    min = cal.get(Calendar.MINUTE);
    
    
    
    
    btnDate.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			showDialog(dateInfo);
			
		}
	});
    
    
    btnTime.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			showDialog(timeInfo);
			
		}
	});
    
    }

    @Override
    @Deprecated
    protected Dialog onCreateDialog(int id) {
    	switch (id) {
		case 11:
			return new DatePickerDialog(this, dateListener, 2014, 0, 10);
			
		case 22:
			return new TimePickerDialog(this, timeListener, hr, min, true);
		default:
			break;
		}
    	
    	
    	return super.onCreateDialog(id);
    }
   
    OnDateSetListener dateListener = new OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
		
			tvDate.setText(dayOfMonth + "," + (monthOfYear+1) + "," + year);
			
		}
	};
	
	
	OnTimeSetListener timeListener = new OnTimeSetListener() {
		
		@Override
		public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
				
			tvTime.setText(hourOfDay + ":" + minute);
		}
	};
}
