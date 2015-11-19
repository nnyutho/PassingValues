package com.example.passingvalues;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText username,password,email;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		username= (EditText) findViewById(R.id.editName);
		password=(EditText) findViewById(R.id.editPassword);
		email=(EditText) findViewById(R.id.editEmail);
		
		b= (Button) findViewById(R.id.btnAdd);
		b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				//Intent to go to next activity
				Intent go_to =new Intent(getApplicationContext(),Staff.class);
				String user=username.getText().toString();
				String pass=password.getText().toString();
				String mail= email.getText().toString();
				
				//Passsing info to the next activity
				Bundle s =new Bundle();
				s.putString("Username", user);
				s.putString("Password", pass);
				s.putString("Email", mail);
				go_to.putExtras(s);
				startActivity(go_to);
				
				
			}
		});
		 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
