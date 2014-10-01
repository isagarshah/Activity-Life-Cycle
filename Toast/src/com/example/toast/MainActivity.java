package com.example.toast;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button bt1,bt2;
	Toast toast1, toast2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt1 = (Button) findViewById(R.id.bt1);
		bt2 = (Button) findViewById(R.id.bt2);
		
		// Customizing Toast Message
		toast2 = new Toast(this);
		toast2.setGravity(Gravity.TOP, 20, 20);
		LayoutInflater inflater = getLayoutInflater();
		
		View my_toast_view = inflater.inflate(R.layout.my_toast, null);
		toast2.setView(my_toast_view);
		
		toast1 = Toast.makeText(MainActivity.this, "I am Toast Message", Toast.LENGTH_LONG);
		toast1.setView(my_toast_view);
		
		TextView tv = (TextView) my_toast_view.findViewById(R.id.tv1);
		tv.setText("I am Toast Message");
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				toast1.show();
			}
		});
		
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				toast2.show();
			}
		});
	}
}
