package org.coep.geometryisfun;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("NewApi")
public class CylinderFormula extends Fragment {

	 @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.activity_cylinder_formula, container, false);
	    return view;
	 }

}