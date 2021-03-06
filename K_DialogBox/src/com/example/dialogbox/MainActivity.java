package com.example.dialogbox;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button bt1,bt2,bt3,bt4;
	AlertDialog.Builder builder,builder2;
	AlertDialog dialog,dialog2;
	ProgressDialog progressDialog;
	Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		bt1 = (Button) findViewById(R.id.bt1);
		bt2 = (Button) findViewById(R.id.bt2);
		bt3 = (Button) findViewById(R.id.bt3);
		bt4 = (Button) findViewById(R.id.bt4);
		
		builder = new AlertDialog.Builder(context);
		builder2 = new AlertDialog.Builder(context);
		
		progressDialog = new ProgressDialog(context);
		progressDialog.setTitle("Please Wait");
		progressDialog.setMessage("Downloading....");
		progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				builder.setTitle("AlertDialog");
				builder.setMessage("Do you want to continue...?");

				builder.setNegativeButton("No", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {

						Toast.makeText(context, "No is Clicked", Toast.LENGTH_LONG).show();
					}
				});

				builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(context, "Yes is Clicked", Toast.LENGTH_LONG).show();
					}
				});

				builder.setNeutralButton("Don't Know", null);

				builder.show();
			}
		});

		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				LayoutInflater inflater = getLayoutInflater();
				View my_dialog_view = inflater.inflate(R.layout.custom_dialog, null);
				
				TextView msg = (TextView) my_dialog_view.findViewById(R.id.tv_msg);
				msg.setText("Is this a Custom Dialog...?");
				Button bt1 = (Button) my_dialog_view.findViewById(R.id.bt1);
				bt1.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						dialog.dismiss();
					}
				});
				dialog = builder2.create();
				dialog.setView(my_dialog_view);
				dialog.show();
			}
		});

		bt3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				progressDialog.show();
			}
		});

		bt4.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
//				NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//				Notification.Builder builder3 = new Notification.Builder(context);
//				builder3.addAction(R.drawable.ic_launcher, "I am notification", null);
//				manager.notify(22,builder3.build());
				
				Notification notificat = new Notification.Builder(getApplicationContext())
		         .setContentTitle("Check your mail @ ")
		         .setContentText("You have a new meeting")
		         .setSmallIcon(R.drawable.cancel)
//		         .setContentIntent(pIntent)
//		         .addAction(R.drawable.reply, "Reply", pReply)
//		         .addAction(R.drawable.forward, "Forward", pForward)
//		         .addAction(R.drawable.delete, "Delete", pDelete)
		         .build();
		   
		   
		   NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		   
		   notificat.flags|= Notification.FLAG_AUTO_CANCEL; 
		   
		   nm.notify(0, notificat);
			}
		});
	}
}
