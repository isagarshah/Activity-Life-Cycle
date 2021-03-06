package com.example.k_contacts;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

	private LinearLayout allContacts;
	int count=0;                                 // count the number of contacts

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		allContacts  = (LinearLayout) findViewById(R.id.lout_parent);

		ContentResolver resolver = getContentResolver();
		Cursor phones = resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, 
				null, null,null, null);
		while (phones != null && phones.moveToNext()) {
			LinearLayout contact = new LinearLayout(this);
			TextView contactName = new TextView(this);
			contactName.setPadding(10, 10, 10, 10);
			contactName.setTextSize(20);
			contactName.setTextColor(Color.GREEN);
			
			TextView contactPhone = new TextView(this);
			contactPhone.setPadding(10, 10, 10, 10);
			contactPhone.setTextSize(20);
			contactPhone.setTextColor(Color.CYAN);
			
			int index_name = phones.getColumnIndex(
					ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
			int index_phone = phones.getColumnIndex(
					ContactsContract.CommonDataKinds.Phone.NUMBER);
			
			String name = phones.getString(index_name);
			
			final String phoneNumber = phones.getString(index_phone);
			
			contactName.setText(name);
			contactPhone.setText(phoneNumber); 
			
			contact.addView(contactName);
			contact.addView(contactPhone);
			
			contact.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
//					if(phoneNumber.equals("555-6"))
//					{
//						Uri number =  Uri.parse("tel:"+phoneNumber);
//						Intent intent_call = new Intent(Intent.ACTION_CALL, number);
//						startActivity(intent_call);
//					}
//					else
//					{
//						Uri number =  Uri.parse("tel:"+phoneNumber);
//						Intent intent_dial = new Intent(Intent.ACTION_DIAL, number);
//						startActivity(intent_dial);
						
						Uri number =  Uri.parse("tel:"+phoneNumber);
						Intent intent_call = new Intent(Intent.ACTION_CALL, number);
						startActivity(intent_call);
//					}
				}
			});
			allContacts.addView(contact);		
		}
		phones.close();
		System.out.println(count);                                               // total numbers of contacts
	}
}