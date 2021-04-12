package com.Logics;

public class Maths {

	public static void main(String[] args) {
		double x=55.0;
		double y=18.0;
		
		double sum=Math.pow(x, 2)+ Math.pow(y,2);
		
		double z=53.0;
		z=Math.abs(z);
		double sub=sum-Math.abs(z);
		
		double answer=Math.cbrt(sub);
		
		System.out.println(answer);

	}

}
