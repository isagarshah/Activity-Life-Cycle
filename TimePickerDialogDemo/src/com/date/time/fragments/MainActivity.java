package com.date.time.fragments;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DatePickerDialogFragment.dateSetListener = dateSetListener;
		TimePickerDialogFragment.onTimeSetListener = timeSetListener;
		findViewById(R.id.btnDate).setOnClickListener(this);
		findViewById(R.id.btnTime).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnDate:
			DialogFragment newFragment = new DatePickerDialogFragment();
		    newFragment.show(getSupportFragmentManager(), "datePicker");
			break;
			
		case R.id.btnTime:
			DialogFragment timeFragment = new TimePickerDialogFragment();
			timeFragment.show(getSupportFragmentManager(), "timePicker");
			break;

		default:
			break;
		}
	}
	
	OnDateSetListener dateSetListener = new OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			Toast.makeText(MainActivity.this, dayOfMonth+"-"+monthOfYear+"-"+year, Toast.LENGTH_SHORT).show();
		}
	};
	
	OnTimeSetListener timeSetListener = new OnTimeSetListener() {
		
		@Override
		public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
			Toast.makeText(MainActivity.this, hourOfDay+" : "+minute, Toast.LENGTH_SHORT).show();
		}
	};
}
