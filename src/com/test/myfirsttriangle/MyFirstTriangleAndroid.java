package com.test.myfirsttriangle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import com.badlogic.gdx.backends.android.AndroidApplication;


public class MyFirstTriangleAndroid extends AndroidApplication implements ActFetch
{
	Button potrdi;
	Spinner spin;
	
    @Override
    public void onCreate (Bundle savedInstanceState) 
    {
          super.onCreate(savedInstanceState);
               
          initialize(new MenuScreen(), false);
               
                
    }
    
    
    
    
    public void openAct(int id) 
    {
        Intent myIntent = new Intent(this, IzbiraMuzikeActivity.class);
        startActivity(myIntent);

   }
    
    public void openAct2(int id) 
    {
        Intent myIntent = new Intent(this, IzbiraMuzikeActivity.class);
        startActivity(myIntent);

   }
    
  
    
    
    
    
}