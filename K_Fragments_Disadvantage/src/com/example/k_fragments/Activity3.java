package com.example.k_fragments;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends ActionBarActivity {
	
	
	TextView txtHome, txtLogout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);

		txtHome = (TextView) findViewById(R.id.txtHome);
		txtLogout = (TextView) findViewById(R.id.txtLogout);
	
		txtHome.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Activity3.this, Activity2.class));

				
			}
		});
		
		 txtLogout.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Toast.makeText(Activity3.this, "Logging out", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(Activity3.this, MainActivity.class);
					intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(intent);
				}
			});
	}

}
