package com.example.myapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText etUsername;
	Button btnContinue, btnAdd;
	SharedPreferences sharedpref;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnAdd = (Button) findViewById(R.id.btnAddMember);
		btnContinue = (Button) findViewById(R.id.btnContinue);
		sharedpref = getSharedPreferences("MySharedPref", MODE_PRIVATE);

		btnContinue.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				etUsername = (EditText) findViewById(R.id.etUsername);
				String user = etUsername.getText().toString().trim();
				
//				if (user.equals(null)){
//					
//					Toast.makeText(MainActivity.this, "Please enter an email address", Toast.LENGTH_SHORT).show();
//					
//				}
				
				if (isValidEmail(user)){
					
					Toast.makeText(MainActivity.this, "Valid Email", Toast.LENGTH_SHORT).show();
					
					doSomething();
				}
				
				else{
					
					Toast.makeText(MainActivity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
					etUsername.setError("Invalid Email");
	
				}
				
				
//				if(user.contains("@"))
//					{
//						String cutEmail = user.substring(0, user.indexOf("@"));
//						Editor editor = sharedpref.edit();
//						editor.putString("email", cutEmail);
//						editor.commit();
//						
//						
//						doSomething();
//					}

				etUsername.setOnEditorActionListener(new OnEditorActionListener() {

							@Override
							public boolean onEditorAction(TextView v,
									int actionId, KeyEvent event) {

								if (actionId == EditorInfo.IME_ACTION_GO) {

									doSomething();

								}

								return false;
							}
						});

			}
		});

	}

	public void doSomething() {

		startActivity(new Intent(MainActivity.this, HomeActivity.class));

	}
	
	public void addMember (View v){
	startActivity(new Intent(MainActivity.this, AddMemberActivity.class));
	}
	
	 private boolean isValidEmail(String email) {
			String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$";


//			"^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
//	        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
//	          +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
//	          +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
//	          +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
//	          +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,3})$";
			
			
			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		} 
}
