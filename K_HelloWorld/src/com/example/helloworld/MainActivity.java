package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	LinearLayout lout;
	TextView tv_title, tv_result;
	Button bt1;
	ImageView img1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_click_listener);
		lout = (LinearLayout) findViewById(R.id.lout);
		tv_title = (TextView) findViewById(R.id.tv_title);
		tv_result = (TextView) findViewById(R.id.tv_result);
		bt1 = (Button) findViewById(R.id.bt1);
		img1 = (ImageView) findViewById(R.id.img1);
		
//		bt1.setOnClickListener(this);
		lout.setOnClickListener(this);
		img1.setOnClickListener(this);
		tv_title.setOnClickListener(this);

		//		findViewById(R.id.bt1).setOnClickListener(new OnClickListener() {
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if(v == bt1)
					tv_result.setText("Button is Clicked");
				int asci = 'a';
			}
		});
//
//		lout.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				tv_result.setText("Linear Layout is Clicked");
//			}
//		});
//
//		lout.setOnLongClickListener(new OnLongClickListener() {
//
//			@Override
//			public boolean onLongClick(View v) {
//				tv_result.setText("Linear Layout is Long Clicked");
//				return false;
//			}
//		});
//
//		img1.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				tv_result.setText("Image is Clicked");
//			}
//		});
//
//		tv_title.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				tv_result.setText("TextView is Clicked");
//			}
//		});
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.lout:
			tv_result.setText("Linear Layout is Clicked");
			break;
			
//		case R.id.bt1:
//			tv_result.setText("Button is Clicked");
//			break;
			
		case R.id.img1:
			tv_result.setText("Image is Clicked");
			break;
			
		case R.id.tv_title:
			tv_result.setText("TextView is Clicked");
			break;

		default:
			break;
		}
	}
}
