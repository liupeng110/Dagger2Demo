package com.noober.dagger2demo;

import android.app.Activity;

import dagger.Component;

@Component(modules = SimpleModuel.class)
public interface SimpleComponent {

	void inject(MainActivity activity);
}
