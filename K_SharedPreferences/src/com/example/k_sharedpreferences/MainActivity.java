package com.example.k_sharedpreferences;

import java.util.jar.Attributes.Name;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements OnClickListener{

    EditText etUsername, etPassword;
    Button btnNext;
    SharedPreferences spreferences;
	boolean s;   //default value is false
	
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        
      
       btnNext = (Button) findViewById(R.id.btnNext);
       
       spreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
       
       btnNext.setOnClickListener(this);
   }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnNext:
			
			if (s){
				
				btnNext.setText("show");
				s= false;
				
				
			}
			else
			{

				btnNext.setText("hide");
				s= true;
				
				
				
			}
			
			etUsername = (EditText) findViewById(R.id.etUsername);
		    etPassword = (EditText) findViewById(R.id.etPassword);
		    String name = etUsername.getText().toString().trim();
		    String password = etPassword.getText().toString().trim();
			
		       
		    if (name.equals("") && password.equals("")) 
		    {
		    	etUsername.setError("Enter value");
		    	etPassword.setError("Enter value");
			}
		    	
		    else if (name.equals(""))
		    {
		    	
		    	etUsername.setError("Enter value");
		    }
		    
		    else if (password.equals(""))
		    {
		    	
		    	etPassword.setError("Enter value");
		    }
		    
		    else{
		    	
		    	Editor editor = spreferences.edit();
				editor.putString("username", name);
				editor.putString("pwd", password);
				editor.commit();
				
				//startActivity(new Intent(this, SecondActivity.class));
		    }
		    
			
			break;

		default:
			break;
		}
		
	}


}


