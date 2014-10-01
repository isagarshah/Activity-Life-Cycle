package com.example.k_activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button btnSend;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Toast.makeText(MainActivity.this, "Activity 1: onCreate", Toast.LENGTH_LONG).show();
        
        setContentView(R.layout.activity_main);
  
    btnSend = (Button) findViewById(R.id.btnSend);
    
    btnSend.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			startActivity(new Intent(MainActivity.this, SecondActivity.class));
			
		}
	});
  }
	
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		Toast.makeText(MainActivity.this, "Activity 1: onStart", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		Toast.makeText(MainActivity.this, "Activity 1: onResume", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		Toast.makeText(MainActivity.this, "Activity 1: onPause", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		Toast.makeText(MainActivity.this, "Activity 1: onStop", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
		Toast.makeText(MainActivity.this, "Activity 1: onDestroy", Toast.LENGTH_LONG).show();
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Toast.makeText(MainActivity.this, "Activity 1 : Back Button is Clicked", Toast.LENGTH_LONG).show();

	
	}
}
