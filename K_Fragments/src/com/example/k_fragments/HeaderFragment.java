package com.example.k_fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class HeaderFragment extends Fragment {

	Activity activity;
	TextView txtHome, txtLogout;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		
		activity = getActivity();
		View v = inflater.inflate(R.layout.activity_header_fragment, null);
		txtHome = (TextView) v.findViewById(R.id.txtHome);
		txtLogout = (TextView) v.findViewById(R.id.txtLogout);
		
		if (activity instanceof MainActivity){
			
			txtHome.setVisibility(View.GONE);
			txtLogout.setVisibility(View.GONE);
			
		}
		
		else if (activity instanceof Activity2){
			txtHome.setVisibility(View.GONE);
		}
		
		txtHome.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(activity, Activity2.class));
				
			}
		});
		
		txtLogout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(activity, MainActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);						
	}
		});
		
		return v;
	}
}
