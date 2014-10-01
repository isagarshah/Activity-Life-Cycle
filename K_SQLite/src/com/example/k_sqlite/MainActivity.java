package com.example.k_sqlite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.bt_add).setOnClickListener(this);
		findViewById(R.id.bt_delete).setOnClickListener(this);
		findViewById(R.id.bt_update).setOnClickListener(this);
		findViewById(R.id.bt_all).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.bt_add:
			startActivity(new Intent(this, AddUserActivity.class));
			break;
			
		case R.id.bt_delete:
			startActivity(new Intent(this, DeleteUserActivity.class));
			break;
			
		case R.id.bt_update:
			startActivity(new Intent(this, UpdateUserActivity.class));
			break;
			
		case R.id.bt_all:
			startActivity(new Intent(this, AllUsersActivity.class));
			break;

		default:
			break;
		}
	}
}
