package com.example.sqlite;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends ActionBarActivity {

	
	EditText etUpdateID, etFirstNameUpdate, etLastNameUpdate;
	Button btnUpdateUser;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update);
	
	
	etUpdateID = (EditText) findViewById(R.id.etUpdateID);
	etFirstNameUpdate = (EditText) findViewById(R.id.etFirstNameUpdate);
	etLastNameUpdate = (EditText) findViewById(R.id.etLastNameUpdate);
	btnUpdateUser = (Button) findViewById(R.id.btnUpdateUser);
	
	
	btnUpdateUser.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			String strid =  etUpdateID.getText().toString().trim();
			String strfName = etFirstNameUpdate.getText().toString().trim();
			String strlName = etLastNameUpdate.getText().toString().trim();
			
			
			if (strid.equals(""))
				etUpdateID.setError("required");
			
			if (strfName.equals("") && (strlName.equals(""))) 
				Toast.makeText(UpdateActivity.this, "Id compulsory and First Name or Last Name required", Toast.LENGTH_LONG).show();
			
			
			
			else
			{
				
				SQLite_DBAdapter adapter = new SQLite_DBAdapter(UpdateActivity.this);
				adapter.open();
				
				if (adapter.update(Integer.parseInt(strid), strfName, strlName))
					Toast.makeText(UpdateActivity.this, "User Updated", Toast.LENGTH_LONG).show();
				
				else
					Toast.makeText(UpdateActivity.this, "User Not Updated", Toast.LENGTH_LONG).show();

					adapter.close();
			}
		
		}
	});
	
	
	
	
	
	
	}

	
}
