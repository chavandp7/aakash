package org.coep.geometryisfun;

import org.coep.geometryisfun.R;

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

public class SphereCalculations extends Fragment {

	  @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		    final View view = inflater.inflate(R.layout.activity_sphere_calculations, container, false);
		    
		    final Button button1 =  (Button)view.findViewById(R.id.button2);
		    
		    button1.setOnClickListener(new View.OnClickListener() {             
		        		public void onClick(View v) {                 
				        // Perform action on click 
		        			final TextView textView = (TextView) view.findViewById(R.id.volValue);
		        			final TextView textView2 = (TextView)view.findViewById(R.id.spareaValue);
				        	EditText editText = (EditText) view.findViewById(R.id.enterRadius);
				            String no = editText.getText().toString();
				            try{
					            if(no != null ){
					            		double no2 = Double.parseDouble(no); 
					            		if(no2 > 0){
					            			double pi = Math.PI;
				            
					            			double vol = (4 * pi * no2 * no2 * no2)/3;
					            			double sparea = 4 * pi * no2 * no2;
				        	
				        	
					            			textView.setText(String.format( "%.2f",vol)+ "cubic. cm");
					            			textView2.setText(String.format( "%.2f",sparea) + " sq.cm");
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