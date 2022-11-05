package com.bridgelab.day6.logical;

import java.util.Scanner;

public class ReverseIntegerWhile {
	public static int reverse(int number) {
		int Integer = number;
		int reverse = 0;
		while(Integer != 0)   {  
			int remainder = Integer % 10;  
			reverse = reverse * 10 + remainder;  
			Integer = Integer/10;
		}
		return reverse;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int Integer = sc.nextInt();
		System.out.println("The given Integer is: " + Integer);
		int reverse = reverse(Integer);
		System.out.println("The reverse of the given Integer is: " + reverse);
	}
	
}
