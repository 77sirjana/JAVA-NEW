package com.nist.exception.custom;

import java.util.Scanner;

public class NewCustom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = a + b;

			System.out.println("sum of two number is"+c);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Rest of code");
	}
}
