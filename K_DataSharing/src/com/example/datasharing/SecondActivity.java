package com.example.datasharing;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {

	TextView txtName, txtPassword;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	
	
	
	txtName = (TextView) findViewById(R.id.txtName);
	txtPassword = (TextView) findViewById(R.id.txtPassword);

	Intent intent = getIntent();
	Bundle bundle2 = intent.getExtras();
	
	//Bundle bundle2 = getIntent().getExtras();

	
	if (bundle2 !=null)
	{
		String str1 = bundle2.getString("user_name");
		//String str1 = bundle.get("user_name").toString();
		String str2= bundle2.getString("password");
		
		txtName.setText("Username--> " + str1);
		txtPassword.setText("Password -->" + str2);
		
		
	}
	
  }
	
}



