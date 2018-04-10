package com.noober.dagger2demo;


import javax.inject.Inject;

public class SubClass1 {

	public int i;

	public String s;

	@Inject
	public SubClass1() {
		this.i = 1;
		this.s = "1";
	}
}
