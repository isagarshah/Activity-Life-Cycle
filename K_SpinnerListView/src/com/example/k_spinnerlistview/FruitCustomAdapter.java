package com.example.k_spinnerlistview;

import java.util.ArrayList;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitCustomAdapter extends BaseAdapter{

	ArrayList<Fruit> fruitsList;
	LayoutInflater inflater;
	Context context;

	public FruitCustomAdapter(ArrayList<Fruit> fruitsList, Context context)
	{
		this.fruitsList = fruitsList;
		this.context = context;
		this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		Log.e("Constructor", "AFter Created");
	}

	@Override
	public View getView(int position, View previousLayout, ViewGroup parent) {
		Log.e("GetView", "Start");
		if(previousLayout == null)
		{
			Log.e("Custom Adapter", "--------> Position : "+position);
			previousLayout = inflater.inflate(R.layout.custom_item, parent,false);
		}
		
		ImageView imageView = (ImageView) previousLayout.findViewById(R.id.img);
		TextView tvName = (TextView) previousLayout.findViewById(R.id.tv_name);
		TextView tvDesc = (TextView) previousLayout.findViewById(R.id.tv_desc);
		TextView tvPrice = (TextView) previousLayout.findViewById(R.id.tv_price);
		
		final Fruit current = fruitsList.get(position);
		imageView.setImageResource(current.getImage());
		tvName.setText(current.getName());
		tvDesc.setText(current.getDesc());
		tvPrice.setText(current.getPrice());
		
//		previousLayout.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				Toast.makeText(context, current.getName(), Toast.LENGTH_SHORT).show();
//			}
//		});
		
		return previousLayout;
	}

	@Override
	public int getCount() {
		return fruitsList.size();
	}

	@Override
	public Fruit getItem(int position) {
		return fruitsList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
}


//*******************This approach we are dividing fruits accordingly for ex: apple name, apple price, app desc