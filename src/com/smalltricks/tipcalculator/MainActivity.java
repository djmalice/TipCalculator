package com.smalltricks.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText etAmount;
	TextView tvTipAmnt,tvTipPercent;
	SeekBar sbTipPercent;
	double tipPercent;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAmount = (EditText)findViewById(R.id.etAmount); 
        tvTipAmnt = (TextView)findViewById(R.id.tvTip);
        tvTipPercent = (TextView)findViewById(R.id.tvTipPercent);
        sbTipPercent = (SeekBar)findViewById(R.id.sbTipPercent);
        
        /* Get Tip Percentage from SeekBar */
        sbTipPercent.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				tvTipPercent.setText(progress/2 + "%");
				tipPercent=progress/2;
				tip10();
			}
		});
        
        /* Tip updated atutomatically with change in total amount */
        etAmount.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				tip10();
			}
		});
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void tip10(){
    	double tipAmount=0;
    	double totalAmount = 0;
    	if(!etAmount.getText().toString().isEmpty())
    		totalAmount=Double.parseDouble(etAmount.getText().toString());
    	tipAmount = totalAmount * tipPercent / 100.00;
    	tvTipAmnt.setText(String.valueOf(Math.round(tipAmount*100)/100.00));
    }
    
        
    
}
