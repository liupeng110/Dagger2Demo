package com.noober.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

	@Inject
	SubClass1 subClass1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DaggerSimpleComponent.builder().simpleModuel(new SimpleModuel(this))
				.build().inject(this);
		subClass1.i = 1;
	}
}
