package com.example.myapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class NewAccountActivity extends ActionBarActivity {

	TextView txtForgotPassword;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_account);

	txtForgotPassword = (TextView) findViewById(R.id.txtForgotPassword);
	
	txtForgotPassword.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {

			startActivity(new Intent(NewAccountActivity.this, PasswordActivity.class));
			
		}
	});
	
	}


}
