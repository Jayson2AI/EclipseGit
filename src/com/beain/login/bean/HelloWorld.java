package com.beain.login.bean;

public class HelloWorld {

	int a;
	int b;

	public static int getSum(int a, int b) {
		return a + b;
	}

	public static int getJi(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		System.out.println("HelloWorld !");

		int c = getSum(5, 10);
		System.out.println(c);
		
		int d = getJi(8, 9);
		System.out.println(d);
	}

}
