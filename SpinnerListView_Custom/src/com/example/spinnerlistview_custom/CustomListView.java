package com.example.spinnerlistview_custom;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends BaseAdapter{

	ArrayList<Integer> imageList;
	ArrayList<String> nameList;
	ArrayList<Integer> phoneList;
	ArrayList<String> emailList;
	LayoutInflater inflater;
	Context context;
	
	public CustomListView(ArrayList<Integer> imageList, ArrayList<String> nameList, ArrayList<Integer> phoneList, 
									ArrayList<String> emailList, LayoutInflater inflater, Context context)
	{
		
		this.imageList = imageList;
		this.nameList = nameList;
		this.phoneList = phoneList;
		this.emailList = emailList;
		this.inflater = inflater;
		this.context = context;
	}
	
	
	
	@Override
	public View getView(int position, View previousLayout, ViewGroup parent) {            
		// Here view refers to the 1st layout in the list view.
		
		if (previousLayout == null){
			
			 previousLayout = inflater.inflate(R.layout.custom_list, parent, false);
		}
		
		 
			
			ImageView imageView = (ImageView) previousLayout.findViewById(R.id.imageView);
			TextView txtName = (TextView) previousLayout.findViewById(R.id.txtName);
			TextView txtPhone = (TextView) previousLayout.findViewById(R.id.txtPhone);
			TextView txtEmail = (TextView) previousLayout.findViewById(R.id.txtEmail);	
	
			
		
			imageView.setImageResource(imageList.get(position));
			txtName.setText(nameList.get(position));
			txtPhone.setText(phoneList.get(position) + "");
			txtEmail.setText(emailList.get(position));
			
		
		
		return previousLayout;
	}
	
	
	@Override
	public int getCount() {
		
		return nameList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

}
