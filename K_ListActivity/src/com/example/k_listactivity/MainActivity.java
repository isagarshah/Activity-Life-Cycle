package com.example.k_listactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	ListView list;
	String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		list = (ListView) findViewById(R.id.list);

		// getListView method create and place (draw) the ListView in the Main Screen
		list = getListView();
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);
		list.setAdapter(adapter);

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String str = parent.getItemAtPosition(position).toString();
				Toast.makeText(MainActivity.this, str+" is Clicked", Toast.LENGTH_SHORT).show();				
			}
		});
	}
}
