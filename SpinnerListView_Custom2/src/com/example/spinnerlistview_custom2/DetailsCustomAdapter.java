package com.example.spinnerlistview_custom2;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsCustomAdapter extends BaseAdapter{
	
	 ArrayList<Details> allDetails;
	 LayoutInflater inflater;
	 Context context;
	
	 

	public DetailsCustomAdapter(ArrayList<Details> allDetails, Context context){
		
		this.allDetails = allDetails;
		this.context = context;
		this.inflater = inflater;
	} 
	 
	@Override
	public View getView(int position, View previousLayout, ViewGroup parent) {
		
		if (previousLayout ==null){
			
			previousLayout = inflater.inflate(R.layout.custom_listview, parent, false);
		} 
		
		
		ImageView imageView = (ImageView) previousLayout.findViewById(R.id.imageView);
		TextView txtName = (TextView) previousLayout.findViewById(R.id.txtName);
		TextView txtPhone = (TextView) previousLayout.findViewById(R.id.txtPhone);
		TextView txtEmail = (TextView) previousLayout.findViewById(R.id.txtEmail);
		
		final Details current = allDetails.get(position);
		
		imageView.setImageResource(current.getImage());
		txtName.setText(current.getName());
		txtPhone.setText(""+ current.getPhone()); // this is an integer so you have to use ""
		txtEmail.setText(current.getEmail());
		
		return previousLayout;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return allDetails.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return allDetails.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}


}
