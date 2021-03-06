package com.example.myapp;

import android.support.v7.app.ActionBarActivity;
import android.text.Layout;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddMemberActivity extends ActionBarActivity {

	Button btnAddMember, btnCustomDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_member);
	
		
		btnAddMember = (Button) findViewById(R.id.btnAddMember);
		btnCustomDialog = (Button) findViewById(R.id.btnCustomDialog);
		
		btnAddMember.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				final AlertDialog.Builder builder1 = new AlertDialog.Builder(AddMemberActivity.this);
				builder1.setTitle("Style");
				builder1.setMessage("Are you a Django ?");
				builder1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						builder1.setMessage("yes you are Django");
						//Toast.makeText(AddMemberActivity.this, "Yes you are a Django", Toast.LENGTH_LONG).show();
						
					}
				});
				
				builder1.show();
			}
		});
	
		
		btnCustomDialog.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				LayoutInflater inflater = getLayoutInflater();
				View my_view = inflater.inflate(R.layout.custom_dialog, null);
				
				TextView msg = (TextView) my_view.findViewById(R.id.btnOK);
				//msg.setText("Please complete all fields");
				Button btnOK = (Button) my_view.findViewById(R.id.btnOK);
				
				AlertDialog.Builder builder2 = new AlertDialog.Builder(AddMemberActivity.this);
				AlertDialog dialog = builder2.create();
				dialog.setView(my_view);
				dialog.show();
			}
		});
		
	}


}
