package com.example.k_spinnerlistview;

import java.util.ArrayList;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter{

	ArrayList<String> namesList;
	ArrayList<String> descsList;
	ArrayList<String> priceList;
	ArrayList<Integer> imageList;
	LayoutInflater inflater;
	Context context;

	public CustomAdapter(ArrayList<String> namesList, ArrayList<String> descsList,
			ArrayList<String> priceList, ArrayList<Integer> imageList, LayoutInflater inflater, Context context)
	{
		this.namesList = namesList;
		this.descsList = descsList;
		this.priceList = priceList;
		this.imageList = imageList;
		this.inflater = inflater;
		this.context = context;
	}

	@Override
	public View getView(final int position, View previousLayout, ViewGroup parent) {
		
		ViewHolder holder = null;
		
		if(previousLayout == null)
		{
			Log.e("Custom Adapter", "--------> Position : "+position);
			previousLayout = inflater.inflate(R.layout.custom_item, parent,false);
			holder = new ViewHolder();
			holder.imageView = (ImageView) previousLayout.findViewById(R.id.img);
			holder.tvName = (TextView) previousLayout.findViewById(R.id.tv_name);
			holder.tvDesc = (TextView) previousLayout.findViewById(R.id.tv_desc);
			holder.tvPrice = (TextView) previousLayout.findViewById(R.id.tv_price);
			previousLayout.setTag(holder);
		}
		
		else
			holder = (ViewHolder) previousLayout.getTag();
		
//		ImageView imageView = (ImageView) previousLayout.findViewById(R.id.img);
//		TextView tvName = (TextView) previousLayout.findViewById(R.id.tv_name);
//		TextView tvDesc = (TextView) previousLayout.findViewById(R.id.tv_desc);
//		TextView tvPrice = (TextView) previousLayout.findViewById(R.id.tv_price);
		
//		imageView.setImageResource(imageList.get(position));
//		tvName.setText(namesList.get(position));
//		tvDesc.setText(descsList.get(position));
//		tvPrice.setText(priceList.get(position));
		
		holder.imageView.setImageResource(imageList.get(position));
		holder.tvName.setText(namesList.get(position));
		holder.tvDesc.setText(descsList.get(position));
		holder.tvPrice.setText(priceList.get(position));
		
		previousLayout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(context, namesList.get(position), Toast.LENGTH_SHORT).show();
			}
		});
		
		return previousLayout;
	}

	@Override
	public int getCount() {
		return namesList.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}
	
	class ViewHolder
	{
		ImageView imageView;
		TextView tvName ;
		TextView tvDesc ;
		TextView tvPrice ;
	}
}
