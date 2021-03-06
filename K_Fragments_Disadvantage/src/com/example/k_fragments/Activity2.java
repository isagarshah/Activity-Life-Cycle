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

public class Activity2 extends ActionBarActivity {

	TextView txtLogout;
	Button btnNext;
	//checking github
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);

		findViewById(R.id.txtHome).setVisibility(View.GONE);

        txtLogout = (TextView) findViewById(R.id.txtLogout);
        txtLogout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Toast.makeText(Activity2.this, "Logging out", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(Activity2.this, MainActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
        
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Activity2.this, Activity3.class));
				
			}
		});
	}


}
