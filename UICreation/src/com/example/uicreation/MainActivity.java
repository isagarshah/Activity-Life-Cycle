package com.example.uicreation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        
        LinearLayout lparent = new LinearLayout(this);
        lparent.setOrientation(LinearLayout.VERTICAL);
      //  lparent.setBackgroundColor(Color.GREEN);
        
        TextView tvFacebook = new TextView(this);
        tvFacebook.setText("facebook");
        tvFacebook.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        lparent.addView(tvFacebook);
        
        EditText etUser = new EditText(this);
        etUser.setGravity(Gravity.BOTTOM);
        lparent.addView(etUser);
        
        EditText etPass = new EditText(this);
        etPass.setGravity(Gravity.BOTTOM);
        lparent.addView(etPass);
        
        
        Button btnLogIn = new Button(this);
        btnLogIn.setText("Log In");
        lparent.addView(btnLogIn);
        
        TextView tvNeedHelp = new TextView(this);
        tvNeedHelp.setText("Need Help");
        tvNeedHelp.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        lparent.addView(tvNeedHelp);
        
        
        setContentView(lparent);
        
        
        final Toast customtoast = new Toast(this);
        customtoast.setGravity(Gravity.CENTER, 100, 200);
        
        LayoutInflater lin = getLayoutInflater();
        View v1 = lin.inflate(R.layout.custom_toast, null);
        customtoast.setView(v1);
        
        
        
        TextView txtCustomToast = (TextView) v1.findViewById(R.id.txtCustomToast);
        txtCustomToast.setText("Moving to Chat");
        
        
        btnLogIn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				customtoast.show();
				Intent itoMessage = new Intent (MainActivity.this, MessageActivity.class);
				startActivity(itoMessage);
			}
		});
    
    }

}
