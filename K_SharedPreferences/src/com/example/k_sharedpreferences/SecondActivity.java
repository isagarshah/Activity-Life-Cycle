package com.example.k_sharedpreferences;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

//	Intent itoThird = new Intent ();
//	startActivity(itoThird);
	
		
	Button btnThird = (Button) findViewById(R.id.btnThird);
	btnThird.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
			
		}
	} );
		
	
	}

}
