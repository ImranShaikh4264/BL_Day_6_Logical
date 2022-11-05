package com.bridgelab.day6.logical;

import java.util.Scanner;

public class ReverseIntegerFor {
	public static int reverse(int number) {
		int Integer = number;
		int reverse = 0;
		System.out.println("Given Integer is : " + Integer);
		for (; Integer != 0; Integer = Integer / 10) {
			int remainder = Integer % 10;
			reverse = reverse * 10 + remainder;
		}
		return reverse;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int Integer = sc.nextInt();
		int reverse = reverse(Integer);
		System.out.println("The reverse of the given Integer is: " + reverse);
	}

}
