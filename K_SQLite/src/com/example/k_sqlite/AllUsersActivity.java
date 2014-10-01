package com.example.k_sqlite;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class AllUsersActivity extends Activity {

	TableLayout layout;
	TextView tvNoRows;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_users);
		
		layout = (TableLayout) findViewById(R.id.table_users);
		tvNoRows = (TextView) findViewById(R.id.tv_no_result);
		
		
		DBAdapter adapter = new DBAdapter(this);
		adapter.open();
		Cursor users = adapter.getAllUsers();

		//		users.moveToFirst();
		//		users.moveToLast();
		//		users.move(3);

		if(users != null && users.moveToFirst())
		{
			tvNoRows.setVisibility(View.GONE);
			layout.setVisibility(View.VISIBLE);
			do{
				TableRow row = new TableRow(this);
				TextView tvId = new TextView(this);
				TextView tvfName = new TextView(this);
				TextView tvlName = new TextView(this);

				row.addView(tvId);
				row.addView(tvfName);
				row.addView(tvlName);

				int id = users.getInt(0);
				String fname = users.getString(1);
				String lname = users.getString(2);

				tvId.setText(id+"");
				tvfName.setText(fname);
				tvlName.setText(lname);
				layout.addView(row);

			}while(users.moveToNext());
		}
		else
		{
			tvNoRows.setVisibility(View.VISIBLE);
			layout.setVisibility(View.GONE);
		}

	}
}
