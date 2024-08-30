package com.nist.exception.custom;

public class CallingCustomException {
	public static void main(String[] args) throws CustomException {
		int a = 5;
		if(a>18) {
			System.out.println("you can");
		} else {
			CustomException obj = new CustomException("no you cant");
			throw obj;
		}
	}
}
