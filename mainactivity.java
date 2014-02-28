package com.example.githubimage;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findEvent();
	}

	private void findEvent() {
		
		
		ImageView iv =(ImageView)findViewById(R.id.iv);
		iv.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=320;i<385;i++){
				al.add(i);
			}
				int x = (int) event.getX();
			    int y = (int) event.getY();
			    
			  if((y==303 || y==305|| y==304)&&(al.contains(x))){
				  Toast.makeText(getApplicationContext(), "wow", Toast.LENGTH_SHORT).show();
			  }
			  else{
				
			  }
				return false;
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
