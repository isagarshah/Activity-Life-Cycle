package com.example.spinnerlistview;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;


public class MainActivity extends ActionBarActivity {

	Spinner sp;
	ListView lv;
	ArrayAdapter<String> spinnerAdapter, listAdapter;
    
	String [] places = {"Select a place", "DC", "New York", "Miami" , "San Francisco"};
    ArrayList<String> nameList = new ArrayList<String>();
 
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    

    sp = (Spinner) findViewById(R.id.spinnerPlaces);
    lv = (ListView) findViewById(R.id.listView);
    
    
	spinnerAdapter = new ArrayAdapter<String> (MainActivity.this, android.R.layout.simple_spinner_dropdown_item, places);
	sp.setAdapter(spinnerAdapter);
    
	nameList.add("Mango");
	nameList.add("Apple");
	nameList.add("Grapes");
	nameList.add("Orange");
	nameList.add("Guava");
	nameList.add("Avacoda");
	
	listAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, nameList);
	lv.setAdapter(listAdapter);
   
    
    }	
	
}
