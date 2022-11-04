package com.bridgelab.day6.logical;

import java.util.Scanner;

public class ReverseIntegerFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int Integer = sc.nextInt(), reverse = 0;
		System.out.println("Given Integer is : " + Integer);
		for (; Integer != 0; Integer = Integer / 10) {
			int remainder = Integer % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given Integer is: " + reverse);
	}

}
