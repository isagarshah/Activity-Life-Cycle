package com.example.spinnerlistview_custom;

import java.util.ArrayList;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

//	Spinner sp;
	ListView lv;
	ArrayAdapter<String> spinnerAdapter, listAdapter;
    
	//String [] places = {"Select a place", "DC", "New York", "Miami" , "San Francisco"};
	
	
	ArrayList<Integer> imageList = new ArrayList<Integer>();
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<Integer> phoneList = new ArrayList<Integer>();
	ArrayList<String> emailList = new ArrayList<String>();
	
	
 
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
// 		sp = (Spinner) findViewById(R.id.spinnerPlaces);   
//    	spinnerAdapter = new ArrayAdapter<String> (MainActivity.this, android.R.layout.simple_spinner_dropdown_item, places);
//    	sp.setAdapter(spinnerAdapter);
        
        
        imageList.add(R.drawable.mango);
		imageList.add(R.drawable.apple);
		imageList.add(R.drawable.grapes);
		imageList.add(R.drawable.orange);
		imageList.add(R.drawable.guava);
		imageList.add(R.drawable.avocado);
		
		
		nameList.add("Mihir");
        nameList.add("Khusboo");
        nameList.add("Pratik");
        nameList.add("Hena");
        nameList.add("Vaibhav");
        nameList.add("Sagar");
	
        phoneList.add(9748);
        phoneList.add(1201);
        phoneList.add(6446);
        phoneList.add(7923);
        phoneList.add(5639);
        phoneList.add(1070);
        
        emailList.add("mihir99@gmail.com");
        emailList.add("khusboo@mihirshah.com");
        emailList.add("pratic009@gmail.com");
        emailList.add("hena@pratikshah.com");
        emailList.add("vkshah88@gmail.com");
        emailList.add("sagar18shah@gmail.com");
        
        
        lv = (ListView) findViewById(R.id.listView);  
        
        CustomListView customListViewAdapter = new CustomListView(imageList, nameList, phoneList, emailList, 
					getLayoutInflater(), this); 
        lv.setAdapter(customListViewAdapter);
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
//		--------------------------  ERROR -------------------------------	
//				TextView myText = (TextView) view;
				String str = nameList.get(position);  
				Toast.makeText(MainActivity.this, "You selected " + str, Toast.LENGTH_LONG).show();
				
			}
		});
        
   
    
    }	
	
}
