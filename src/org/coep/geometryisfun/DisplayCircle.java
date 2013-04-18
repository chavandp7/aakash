package org.coep.geometryisfun;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

@SuppressLint("NewApi")
public class DisplayCircle extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_circle);
    }
    
    public void callCircleConcepts(View view){
	    Intent i = new Intent(this, DisplayCircleConcepts.class);
	    startActivity(i);
	}
} 
