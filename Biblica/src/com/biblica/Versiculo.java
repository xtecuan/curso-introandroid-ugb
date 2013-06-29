package com.biblica;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Versiculo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.versiculo);
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
	            Toast.makeText(this, "BiblicaActivity", Toast.LENGTH_SHORT).show();
	           
	   	        return true;
	 
	        case R.id.item2:
	            Toast.makeText(this, "Versiculo", Toast.LENGTH_SHORT).show();
	            
	            return true;
	        
	        case R.id.item3:
	        	
	            Toast.makeText(this, "Salir", Toast.LENGTH_SHORT).show();
	            
	            return true;
	 	 
	        default:
	            return super.onOptionsItemSelected(item);
	        }
	    }
}
