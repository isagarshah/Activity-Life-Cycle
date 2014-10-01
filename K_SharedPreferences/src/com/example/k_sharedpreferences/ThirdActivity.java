package com.example.k_sharedpreferences;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ThirdActivity extends ActionBarActivity {

	
	TextView txtUsername, txtPassword;
	SharedPreferences spreferences2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
	
	
		txtUsername = (TextView) findViewById(R.id.txtUsername);
		txtPassword = (TextView) findViewById(R.id.txtPassword);
		
		spreferences2 = getSharedPreferences("MySharedPref", MODE_PRIVATE);
		String str1= spreferences2.getString("username", "No Username");
		String str2= spreferences2.getString("pwd", "No Password");
		
		txtUsername.setText("Username is-->" + str1);
		txtPassword.setText("Password is-->" + str2);
		
		
		
		
	
	}
}


