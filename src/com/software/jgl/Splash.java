package com.software.jgl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				startActivity(new Intent(Splash.this, BrowserActivity.class));
				finish();
			}
		};
		new Handler().postDelayed(runnable, 3000);
	}
}
