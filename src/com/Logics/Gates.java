package com.Logics;

public class Gates {

	public static void main(String[] args) {
		boolean x=true;
		
		boolean y=true;
		
		boolean NOT_x=!x;
		boolean XOR_x=NOT_x^x;
		boolean AND_y=XOR_x && y;
		boolean NOT=!AND_y;
		System.out.println(NOT);
		
		
		

	}

}
