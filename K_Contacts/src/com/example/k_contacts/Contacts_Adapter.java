package com.example.k_contacts;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Contacts_Adapter extends BaseAdapter {
	private List<ContactsModel> list;
	Context context;

	Contacts_Adapter (List<ContactsModel> list, Context context){
		this.list = list;
		this.context = context;
	}

	@Override
	public int getCount() {
		return list.size();
	}
	@Override
	public Object getItem(int arg0) {
		return list.get(arg0);
	}
	@Override
	public long getItemId(int arg0) {
		return arg0;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = convertView;
		if (v == null)
		{
			LayoutInflater vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.contacts_list, null);
		}
		TextView contactName = (TextView)v.findViewById(R.id.tvname);
		TextView contactPhone = (TextView)v.findViewById(R.id.tvphone);

		ContactsModel msg = list.get(position);
		contactName.setText(msg.getName());
		contactPhone.setText(msg.getPhoneNo());                   

		return v;
	}
}