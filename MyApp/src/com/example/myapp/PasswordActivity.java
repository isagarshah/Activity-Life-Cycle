package com.example.myapp;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordActivity extends ActionBarActivity {

	TextView txtUser;
	EditText etPassword;
	SharedPreferences sharedpref;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_password);
	
	
	txtUser = (TextView) findViewById(R.id.txtUser);
	sharedpref = getSharedPreferences("MySharedPref", MODE_PRIVATE);
	String str1 = sharedpref.getString("email", "UserInfo");
	
	txtUser.setText("Welcome " + str1 + ", please enter your password.");
	
	
	
	
	}

}
