package org.coep.geometryisfun;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class DisplayGeometryObjects extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_geometry_objects);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_geometry_objects, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void callCircle(View view){
		Intent intentCircle = new Intent(this, DisplayCircle.class);
		startActivity(intentCircle);
	}
	
	public void callTriangle(View view){
		Intent intentTriangle = new Intent(this, DisplayTriangle.class);
		startActivity(intentTriangle);
	}
	
	public void callParallelogram(View view){
		Intent intentParallelogram = new Intent(this, DisplayParallelogramNew.class);
		startActivity(intentParallelogram);
	}
	
	public void callRectangle(View view){
		Intent intentRectangle = new Intent(this, DisplayRectangle.class);
		startActivity(intentRectangle);
	}
	

	public void callCone(View view){
		Intent intentCone = new Intent(this, DisplayCone.class);
		startActivity(intentCone);
	}
	
	public void callCylender(View view){
		Intent intentCylender = new Intent(this, DisplayCylender.class);
		startActivity(intentCylender);
	}
	
	public void callSphere(View view){
		Intent intentSphere = new Intent(this, DisplaySphere.class);
		startActivity(intentSphere);
	}
	
	public void Contactus(View view){
		Intent intentSphere = new Intent(this, ContactUs.class);
		startActivity(intentSphere);
	}
}
