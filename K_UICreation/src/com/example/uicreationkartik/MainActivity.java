package com.example.uicreationkartik;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout parent = new LinearLayout(this);
		parent.setOrientation(LinearLayout.VERTICAL);
		
		TextView textView = new TextView(this);
		textView.setText("UI Creation Methods");
		textView.setGravity(Gravity.CENTER_HORIZONTAL);
		parent.addView(textView);
		
		
		LinearLayout child = new LinearLayout(this);
		child.setOrientation(LinearLayout.HORIZONTAL);
		
		parent.addView(child);
		Button bt1 = new Button(this);
		bt1.setText("Button 1");
		child.addView(bt1);
		
		Button bt2 = new Button(this);
		bt2.setText("Button 2");
		child.addView(bt2);
		
		TextView result = new TextView(this);
		result.setText("No Result");
		parent.addView(result);
		
		setContentView(parent);
	}
}
