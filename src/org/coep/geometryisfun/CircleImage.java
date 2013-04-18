package org.coep.geometryisfun;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

@SuppressLint("NewApi")
public class CircleImage extends Fragment {

		@Override
  
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			
			View V = inflater.inflate(R.layout.activity_circle_image, container, false);
			ImageView image = (ImageView)V.findViewById(R.id.circle);
			image.setImageResource(R.drawable.circle);
			return V;
			
		  	
		}

} 