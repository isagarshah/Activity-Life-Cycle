package com.example.uicreation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MessageActivity extends ActionBarActivity {

	Spinner spin;
	LinearLayout lchat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);

		String [] msgs = new String [] {"Hi", "Holaaa", "Wassup dau", "Kithe ho", "Django"};
		String [] spinnerNames = new String [] {"Mihir", "Pratik", "Vaibhav", "Sagar"};

		spin = (Spinner) findViewById(R.id.spinner_chat);
		lchat = (LinearLayout) findViewById(R.id.lchat);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>
		(this, android.R.layout.simple_spinner_dropdown_item, spinnerNames);

		spin.setAdapter(adapter);

		spin.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				TextView tv = (TextView) view; 

				Toast.makeText(MessageActivity.this, "Switching to " + tv.getText(), Toast.LENGTH_LONG).show();

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});


		LayoutInflater inflater = getLayoutInflater();
		for (int i = 0; i < msgs.length; i++) {

			View v1;

			if (i%2 ==1)
				v1 = inflater.inflate(R.layout.msg_left, null);
			else
				v1 = inflater.inflate(R.layout.msg_right, null);

			TextView senderName = (TextView) v1.findViewById(R.id.txtSenderName);
			TextView actualMsg = (TextView) v1.findViewById(R.id.txtActualMsg);
			TextView location = (TextView) v1.findViewById(R.id.txtLocation);
			TextView datetime = (TextView) v1.findViewById(R.id.txtDateTime);

			Calendar c = Calendar.getInstance(); 
			int seconds = c.get(Calendar.SECOND);
			//Dateformat simpledateformat in java patterns
			
			SimpleDateFormat format1;
			format1= new SimpleDateFormat("MMM hh  ");

			
			if (i%2 ==1)
			
			senderName.setText("Mihir Shah");
			actualMsg.setText(msgs[i]);
			location.setText("India");
			datetime.setText(seconds + "");
			


			lchat.addView(v1);

		} 
	}

}
