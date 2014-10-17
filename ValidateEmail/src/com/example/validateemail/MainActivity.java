package com.example.validateemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

Button btnGoToSMS, btnValidateEmail;
EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
etEmail = (EditText) findViewById(R.id.etEmailAddress);        
btnGoToSMS = (Button) findViewById(R.id.btnGoToSMS);
btnValidateEmail = (Button) findViewById(R.id.btnValidateEmail); 

btnValidateEmail.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		etEmail = (EditText) findViewById(R.id.etEmailAddress);        
		String checkEmail = etEmail.getText().toString();
		
		if (!isValidEmail(checkEmail)){
			
			Toast.makeText(MainActivity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
			etEmail.setError("Invalid Email");
		}
		
		else{
			
			Toast.makeText(MainActivity.this, "Valid Email", Toast.LENGTH_SHORT).show();

			
		}
		

		
		
	}
});

btnGoToSMS.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		startActivity(new Intent (MainActivity.this, SendSMSActivity.class));
		
	}
});
    
    }
    
    private boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$";


//		"^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
//        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
//          +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
//          +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
//          +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
//          +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,3})$";
		
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	} 
    
   
}
    
