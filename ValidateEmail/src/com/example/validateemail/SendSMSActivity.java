package com.example.validateemail;

import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsMessage;
import android.telephony.gsm.SmsManager;
import android.os.Bundle;
import android.provider.Telephony.Sms;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendSMSActivity extends ActionBarActivity {

	Button btnSendSMS;
	EditText etSMS, etNo;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_sms);
	
		etSMS = (EditText) findViewById(R.id.etSMS);
		etNo = (EditText) findViewById(R.id.etNo);
		btnSendSMS = (Button) findViewById(R.id.btnSendSMS);
		
		final String message = etSMS.getText().toString();
		final String number = etNo.getText().toString();
		
		
		btnSendSMS.setOnClickListener(new OnClickListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				
				try {
					
					@SuppressWarnings("deprecation")
					SmsManager smsmanager = SmsManager.getDefault();
					
					smsmanager.sendTextMessage(number, null, message, null, null);
					//smsmanager.sendTextMessage("+12022471070", null, message ,null,null);
					Toast.makeText(getApplicationContext(), "Send Successfully", Toast.LENGTH_SHORT).show();
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
	
	}


	
	
	
}
