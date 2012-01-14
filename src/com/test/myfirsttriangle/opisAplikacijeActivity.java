package com.test.myfirsttriangle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class opisAplikacijeActivity extends Activity
{
	Button gumb;
	TextView tv1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opis_avtorja);
		
		tv1 = (TextView) findViewById(R.id.textView1);
		gumb = (Button) findViewById(R.id.button1);
		
		tv1.setText("iManager je aplikacija za ultimativno planiranje dogodkov, spremljanje vremena in novic ter vključuje opcijo GPS opomnikov, kar pomeni da nas telefon glede na trenutno lokacijo spomni na pred tem shranjene opomnike(primer: Če si že v Mariboru potem še kupi kartuše za tiskalnik). Aplikacija še prav tako vključuje budilko, ki omogoča več možnosti za izklop alarma(prisili nas da se res dvignemo iz postelje), kot so naprimer: reševanje metamatičnih računov, ali večkratni dvig telefona(npr. 15 krat). Vse shranjene nastavitve aplikacije in podatke bo možno varnostno kopirati na spletni strežnik ali na lokalni pomnilniški prostor.");
		
		
		gumb.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				System.exit(0);
				
			}
		});
		
	}

}
