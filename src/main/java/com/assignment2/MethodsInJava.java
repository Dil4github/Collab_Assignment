package com.assignment2;

import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class MethodsInJava {

	//Methods are also known as functions
	//Methods are known as independent units of execution
	//accessmodifier static /non-static returnType nameOfTheMethod (()
	//}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		hello ();
		sample(10, 20, 30);
		test ("hello", "world");
			System.out.println("val");
	}

	public static int sample(int i, int j, int k) {
	i=10;
	j=20;
	k=30;
	
	int sum =i+j+k;
	return sum; //what are you trying to return? return type is int, not void.
	}
	
	public static String test(String S1, String S2) {
		String S3=S1+S2;	//return type is String not void.
		return S3;
	}
	
	public static void hello () {
		System.out.println("Hello Method");
	}

}
