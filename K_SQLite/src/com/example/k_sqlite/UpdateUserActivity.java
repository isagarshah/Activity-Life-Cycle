package com.example.k_sqlite;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateUserActivity extends Activity {

	EditText etId, etfName, etlName;
	Button btUpate, btReset;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update_user);
		
		
		etId = (EditText) findViewById(R.id.et_uid);
		etfName = (EditText) findViewById(R.id.et_fname);
		etlName = (EditText) findViewById(R.id.et_lname);
		btUpate = (Button) findViewById(R.id.bt_update);
		btReset = (Button) findViewById(R.id.bt_reset);
		
		btUpate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String strUid = etId.getText().toString().trim();
				String strlname = etlName.getText().toString().trim();
				String strfname = etfName.getText().toString().trim();
				
				
				if(strUid.equals("") || (strfname.equals("") && strlname.equals("")))
				{
					Toast.makeText(UpdateUserActivity.this, "Please Fill the Required Fields",
							Toast.LENGTH_SHORT).show();
				}else
				{
					DBAdapter adapter = new DBAdapter(UpdateUserActivity.this);
					adapter.open();
					int row = adapter.updateUser(Integer.parseInt(strUid), strfname, strlname);
					if(row>0)
						Toast.makeText(UpdateUserActivity.this, "User Details are Updated",
								Toast.LENGTH_SHORT).show();
					else
						Toast.makeText(UpdateUserActivity.this, "User Details are Not Updated",
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
