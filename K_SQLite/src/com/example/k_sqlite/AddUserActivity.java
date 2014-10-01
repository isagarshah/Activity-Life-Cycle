package com.example.k_sqlite;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddUserActivity extends Activity {

	EditText etId, etfName, etlName;
	Button btAdd, btReset;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_user);
		
		etId = (EditText) findViewById(R.id.et_uid);
		etfName = (EditText) findViewById(R.id.et_fname);
		etlName = (EditText) findViewById(R.id.et_lname);
		btAdd = (Button) findViewById(R.id.bt_add);
		btReset = (Button) findViewById(R.id.bt_reset);
		
		btAdd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String strUid = etId.getText().toString().trim();
				String strlname = etlName.getText().toString().trim();
				String strfname = etfName.getText().toString().trim();
				
				
				if(strUid.equals("") || strfname.equals("") || strlname.equals(""))
				{
					Toast.makeText(AddUserActivity.this, "Please Fill all the Fields",
							Toast.LENGTH_SHORT).show();
				}
				
				else
				{
					DBAdapter adapter = new DBAdapter(AddUserActivity.this);
					adapter.open();
//					long row = adapter.addUser(Integer.parseInt(strUid), strfname, strlname);
//					if(row>0)
					if(adapter.addUser(Integer.parseInt(strUid), strfname, strlname))
						Toast.makeText(AddUserActivity.this, "User is Created",
								Toast.LENGTH_SHORT).show();
					else
						Toast.makeText(AddUserActivity.this, "User is Not Created",
								Toast.LENGTH_SHORT).show();
					adapter.close();
				}
			}
		});
		
		btReset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				etId.setText("");
				etlName.setText("");
				etfName.setText("");
			}
		});
	}
}
