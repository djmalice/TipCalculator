package com.smalltricks.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText etAmount;
	TextView tvTipAmnt;
	
	double tip;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAmount = (EditText)findViewById(R.id.etAmount); 
        tvTipAmnt = (TextView)findViewById(R.id.tvTip);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void tip10(View v){
    	tip = Double.parseDouble(etAmount.getText().toString()) * 0.1;
    	tvTipAmnt.setText(new String("Tip is: " + Math.round(tip*100)/100));
    }
    
    public void tip15(View v){
    	tip= Double.parseDouble(etAmount.getText().toString()) * 0.15;
    	tvTipAmnt.setText(new String("Tip is: " + Math.round(tip*100)/100));
    }

    public void tip20(View v){
    	tip= Double.parseDouble(etAmount.getText().toString()) * 0.20;
    	tvTipAmnt.setText(new String("Tip is: " + Math.round(tip*100)/100));
    }
    
    
}
