package com.none.study.example;

public class Computer extends Calculator{

	@Override
	public double radius(double param) {
		return constants.PAI_2*param*param;
	}
}
