package com.biblica;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BiblicaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bactivity_iblica);
		
		Thread splashThread = new Thread() {
	         @Override
	         public void run() {
	            try {
	               int waited = 0;
	               while (waited < 4000) {
	                  sleep(100);
	                  waited += 100;
	               }
	            } catch (InterruptedException e) {
	               // do nothing
	            } finally {
	               finish();
	               Intent i = new Intent();
	               	i.setClassName("com.biblica",
                          "com.biblica.Versiculo");
                          
	               startActivity(i);
	            }
	         }
	      };
	      splashThread.start();

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.biblica, menu);
		return true;
	}
	
	 @Override
	    public boolean onOptionsItemSelected(MenuItem item)
	    {
	         
	        switch (item.getItemId())
	        {
	 
	        case R.id.item1:
	            Toast.makeText(this, "versiculo", Toast.LENGTH_SHORT).show();
	            
	            return true;
	        
	        case R.id.item3:
	        	
	            Toast.makeText(this, "Salir", Toast.LENGTH_SHORT).show();
	            
	            return true;
	 	 
	        default:
	            return super.onOptionsItemSelected(item);
	        }
	    }

}
