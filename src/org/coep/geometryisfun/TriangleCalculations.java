package org.coep.geometryisfun;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi")
public class TriangleCalculations extends Fragment {

	 @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		    final View view = inflater.inflate(R.layout.activity_triangle_calculations, container, false);
		    
		    final Button button1 =  (Button)view.findViewById(R.id.button2);
		    
		    button1.setOnClickListener(new View.OnClickListener() {             
		        		public void onClick(View v) {                 
				        // Perform action on click 
		        		final TextView textView = (TextView) view.findViewById(R.id.perimeterValue);
		        		final TextView textView2 = (TextView)view.findViewById(R.id.areaValue);
		        		
		        		EditText sidea = (EditText) view.findViewById(R.id.enterA);
		        		EditText sideb = (EditText) view.findViewById(R.id.enterB);
		        		EditText sidec = (EditText) view.findViewById(R.id.enterC);
		        		
		        		String s1 = sidea.getText().toString(); 
			            String s2 =sideb.getText().toString(); 
			            String s3 = sidec.getText().toString();
			            
			            try{
			            	
			            	if((s1 != null) && (s2 != null) && (s3 != null)){
			            		double a = Double.parseDouble(s1);
			            		double b = Double.parseDouble(s2);
			            		double c = Double.parseDouble(s3); 
			            
			            		if((a > 0) && (b > 0) && (c > 0) && ((a+b) > c) && ((a+c) > b) && ((b+c) > a)){
			            			double s = (a + b + c) / 2;
			            			double area = Math.sqrt(s * (s-a) * (s-b) * (s-c) );
			            			double perimeter = a + b + c;
			            			textView.setText(String.format( "%.2f",perimeter)+ " cm");
			            			textView2.setText(String.format( "%.2f",area) + " sq.cm");
			            		}
			            		
			            		else{
			            			 Toast msg = Toast.makeText(getActivity(), "Please, Give proper input", Toast.LENGTH_LONG);
					            	 msg.show();
			            		}
			            	}
			            }
			            
			            catch (NumberFormatException e) {
					        Toast msg = Toast.makeText(getActivity(), "Please, Give proper input", Toast.LENGTH_LONG);
				            msg.show();
			            }
	        		}
	    }
		    );
		    
		 return view;

	 }
}
