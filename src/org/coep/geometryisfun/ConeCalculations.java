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
public class ConeCalculations extends Fragment {

	 @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		    final View view = inflater.inflate(R.layout.activity_cone_calculations, container, false);
		    
		    final Button button1 =  (Button)view.findViewById(R.id.button2);
		    
		    button1.setOnClickListener(new View.OnClickListener() {             
		        		public void onClick(View v) {                 
				        // Perform action on click 
		        		final TextView textView = (TextView) view.findViewById(R.id.volumeValue);
		        		final TextView textView2 = (TextView)view.findViewById(R.id.careaValue);
		        		final TextView textView3 = (TextView)view.findViewById(R.id.tareaValue);
		        		
		        		EditText r = (EditText) view.findViewById(R.id.enterR);
		        		EditText h = (EditText) view.findViewById(R.id.enterH);
		        		EditText l = (EditText) view.findViewById(R.id.enterL);
		        		
		        		String s1 = r.getText().toString(); 
			            String s2 =h.getText().toString();
			            String s3 = l.getText().toString();
			            
			            try{
			            	
			            	if((s1 != null) && (s2 != null) && (s3 != null)){
			            		double a = Double.parseDouble(s1);
			            		double b = Double.parseDouble(s2); 
			            		double c = Double.parseDouble(s3); 
			            		
			            		if((a > 0) && (b > 0) && (c > 0) && ((a*a) + (b*b) == (c*c))){
			            		
			            			double vol = (Math.PI * a * a * b)/3 ;
			            			double curved = Math.PI * a * a * c;
			            			double total = Math.PI * a * (a + c);
			            			textView.setText(String.format( "%.2f",vol)+ " cubic cm");
			            			textView2.setText(String.format( "%.2f",curved) + " sq.cm");
			            			textView3.setText(String.format( "%.2f",total) + " sq.cm");
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
