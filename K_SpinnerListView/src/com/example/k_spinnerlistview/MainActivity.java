package com.example.k_spinnerlistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity{

	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		listView = getListView();
		
		FruitCustomAdapter fruitCustomAdapter = new FruitCustomAdapter(FruitDataList.getFruits(), this);
		
		listView.setAdapter(fruitCustomAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String str = parent.getItemAtPosition(position).toString(); 
				Toast.makeText(MainActivity.this, "Go and Eat "+str, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
