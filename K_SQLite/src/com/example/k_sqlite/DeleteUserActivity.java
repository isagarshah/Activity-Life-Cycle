package com.example.k_sqlite;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteUserActivity extends Activity {

	EditText etId;
	Button btDelete, btReset;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_delete_user);
		
		
		etId = (EditText) findViewById(R.id.et_uid);
		btDelete = (Button) findViewById(R.id.bt_delete);
		btReset = (Button) findViewById(R.id.bt_reset);
		
		btDelete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String strUid = etId.getText().toString().trim();
				
				
				if(strUid.equals(""))
				{
					Toast.makeText(DeleteUserActivity.this, "Please Enter User Id",
							Toast.LENGTH_SHORT).show();
				}else
				{
					DBAdapter adapter = new DBAdapter(DeleteUserActivity.this);
					adapter.open();
					
					int deleted = adapter.deleteUser(Integer.parseInt(strUid));
					if(deleted>0)
						Toast.makeText(DeleteUserActivity.this, "User is Deleted",
								Toast.LENGTH_SHORT).show();
					else
						Toast.makeText(DeleteUserActivity.this, "User is Not Deleted",
								Toast.LENGTH_SHORT).show();
					adapter.close();
				}
			}
		});
		
		btReset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				etId.setText("");
			}
		});
	}
}
