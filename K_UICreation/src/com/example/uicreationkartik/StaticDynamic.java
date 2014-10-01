package com.example.uicreationkartik;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StaticDynamic extends Activity {

	LinearLayout layout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.static_dynamic_main);
		
		layout = (LinearLayout) findViewById(R.id.parent);
		
		TextView textView = new TextView(this);
		textView.setText("No Result");
		layout.addView(textView);
	}
}
