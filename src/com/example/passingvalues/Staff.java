package com.example.passingvalues;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Staff extends Activity {
	TextView user,pass,mail;
	
	public void onCreate(Bundle savedInstanceBundle) {
		super.onCreate(savedInstanceBundle);
		setContentView(R.layout.staff_layout_view);
		Bundle extras = getIntent().getExtras();
		String username=extras.getString("Username");
		String password=extras.getString("Password");
		String email =extras.getString("Email");

		//import TextViews
		user =(TextView) findViewById(R.id.txtName);
		pass = (TextView) findViewById(R.id.txtPass);
		mail=(TextView) findViewById(R.id.textEmail);
		
		user.setText("Welcome! Registered under:" + username);
		pass.setText("Your password is:" + password);
		mail.setText("Your email is:" +email);
		
		
		
				
		
	
	}
}
