package com.example.chatexample;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	String[] msgs = new String[] {"Hi", "Hi", "Hw are U ?","fine hw about U ?","I am Good", 
			"blaaa", "holaaa", "Django","music is life", "doing well"};
	
	String[] names = new String[] {"Sagar", "Karthik"};
	
	boolean firstTime = true;
	ArrayAdapter<String> adapter;
	LinearLayout layoutMsgs;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		Spinner sp = (Spinner) findViewById(R.id.sp_names);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
		sp.setAdapter(adapter);
		
		
		layoutMsgs = (LinearLayout) findViewById(R.id.lout_msgs);
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				firstTime = false;
				if(!firstTime)
					Toast.makeText(MainActivity.this, "Switched to "+names[position], Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		LayoutInflater inflater = getLayoutInflater();
		for(int i = 0; i < msgs.length; ++i)
		{
			View msg;
			if(i%2 == 1)
				msg = inflater.inflate(R.layout.message_layout_left, null);
			else
				msg = inflater.inflate(R.layout.message_layout_right, null);
			
			TextView tvName = (TextView) msg.findViewById(R.id.tv_title);
			
			if(i%2 == 1)
				tvName.setText("Me");
			
			layoutMsgs.addView(msg);
		}
	}
}
