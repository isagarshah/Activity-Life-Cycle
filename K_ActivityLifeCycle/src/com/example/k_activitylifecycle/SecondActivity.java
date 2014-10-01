package com.example.k_activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Toast.makeText(SecondActivity.this, "Activity 2: onCreate", Toast.LENGTH_LONG).show();

		setContentView(R.layout.activity_second);
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		Toast.makeText(SecondActivity.this, "Activity 2: onStart", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		Toast.makeText(SecondActivity.this, "Activity 2: onResume", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		Toast.makeText(SecondActivity.this, "Activity 2: onPause", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		Toast.makeText(SecondActivity.this, "Activity 2: onStop", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
		Toast.makeText(SecondActivity.this, "Activity 2: onDestroy", Toast.LENGTH_LONG).show();
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Toast.makeText(SecondActivity.this, "Activity 2 : Back Button is Clicked", Toast.LENGTH_LONG).show();

	
	}
}
