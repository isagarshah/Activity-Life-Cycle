package com.example.datasharing;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

	EditText etName, etPassword;
	Button btnGoToNext;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        btnGoToNext = (Button) findViewById(R.id.btnNext);
        btnGoToNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				etName = (EditText) findViewById(R.id.etName);
			    etPassword = (EditText) findViewById(R.id.etPassword);
			    
			    String name = etName.getText().toString().trim();
				String pwd =  etPassword.getText().toString().trim();

				
				if (name.equals("")){
					
					etName.setError("Enter Name");
				}
				
				else if(pwd.equals("")){
					
					etPassword.setError("Enter Password");
				}
				
				else {
					
				Bundle bundle = new Bundle();
				bundle.putString("user_name", name);
				bundle.putString("password", pwd);
				
				Intent itoSecondActivity = new Intent(MainActivity.this, SecondActivity.class);
				itoSecondActivity.putExtras(bundle);
				startActivity(itoSecondActivity);
				
				
				/********************  METHOD 2 ***************************************\
				
				Intent itoSecondActivity = new Intent(MainActivity.this, SecondActivity.class);
				itoSecondActivity.putExtra("user_name", name);
				itoSecondActivity.putExtra("password", pwd);
				startActivity(itoSecondActivity);
				
				*/
				
				
				
				}
				
			}
		});

        
        
        
    
 }


}
