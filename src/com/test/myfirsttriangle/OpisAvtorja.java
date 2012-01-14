package com.test.myfirsttriangle;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OpisAvtorja extends Activity
{

	TextView tv1;
	Button gumbaNazaj;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opis_avtorja);
		
		tv1 = (TextView) findViewById(R.id.textView1);
		gumbaNazaj = (Button) findViewById(R.id.button1);
		tv1.setText("Avtor:\nPrimož Režek");
		
		
		

		
		gumbaNazaj.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				System.exit(0);
				
			}
		});
		
	}
	


}
