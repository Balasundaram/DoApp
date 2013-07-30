package com.example.phonegapdoosra;

import org.apache.cordova.DroidGap;

import android.os.Bundle;





	public class MainActivity extends /* Activity */DroidGap {

	    // @Override
	    // protected void onCreate(Bundle savedInstanceState) {
	    // super.onCreate(savedInstanceState);
	    // setContentView(R.layout.activity_main);
	    // }

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	      
	        super.loadUrl("file:///android_asset/www/index.html");
	    }

	  
	    

	} 