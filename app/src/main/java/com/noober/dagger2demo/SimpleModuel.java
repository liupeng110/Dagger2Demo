package com.noober.dagger2demo;

import android.app.Activity;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class SimpleModuel {

	private Activity activity;

	public SimpleModuel(Activity activity) {
		this.activity = activity;
	}

}
