package com.example.sqlite;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button btnAdd, btnDelete, btnUpdate, btnAll; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        	findViewById(R.id.btnAdd).setOnClickListener(this); 
        	findViewById(R.id.btnDelete).setOnClickListener(this);
        	findViewById(R.id.btnUpdate).setOnClickListener(this); 
        	findViewById(R.id.btnAll).setOnClickListener(this);   
}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.btnAdd:
			startActivity(new Intent(MainActivity.this, AddActivity.class));
			break;
			
		case R.id.btnDelete:
			startActivity(new Intent(MainActivity.this, DeleteActivity.class));
			break;
			
		case R.id.btnUpdate:
			startActivity(new Intent(MainActivity.this, UpdateActivity.class));
			break;
			
		case R.id.btnAll:
			startActivity(new Intent(MainActivity.this, AllUserActivity.class));
			break;


		default:
			break;
		}
		
	}

}
