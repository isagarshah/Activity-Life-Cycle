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

public class AddActivity extends ActionBarActivity {

	Button btnCreateUser, btnReset;
	EditText etID, etFirstName, etLastName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		etID = (EditText) findViewById(R.id.etIDAdd);
		etFirstName = (EditText) findViewById(R.id.etFirstNameAdd);
		etLastName = (EditText) findViewById(R.id.etLastNameAdd);
		
		btnReset = (Button) findViewById(R.id.btnReset);
		btnReset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				etID.setText("");
				etFirstName.setText("");
				etLastName.setText("");
				
			}
		});
		
		
		btnCreateUser = (Button) findViewById(R.id.btnCreateUser);
		btnCreateUser.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String strid = etID.getText().toString().trim();
				String strfname = etFirstName.getText().toString().trim();
				String strlname = etLastName.getText().toString().trim();
				
				if (strid.equals("")){
					etID.setError("required");
				}
				if (strfname.equals("")){
					etFirstName.setError("required");
				}
				if (strlname.equals("")){
					etLastName.setError("required");
				}
				
				else
				{
					SQLite_DBAdapter adapter = new SQLite_DBAdapter(AddActivity.this);
					adapter.open();
					
					if (adapter.addUser(Integer.parseInt(strid), strfname, strlname))
						Toast.makeText(AddActivity.this, "User Created", Toast.LENGTH_LONG).show();
					
					else
					{
						Toast.makeText(AddActivity.this, "User Not Created", Toast.LENGTH_LONG).show();
						
					}
					adapter.close();
				}
			}
		});
	}
}
