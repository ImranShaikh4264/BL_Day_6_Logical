package com.bridgelab.day6.logical;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Fibonacci number required");
		int count = sc.nextInt();
		int Number1 = 0;
		int Number2 = 1;
		System.out.print(Number1 + " " + Number2);
		int Number3 = 0;
		for (int i = 1; i <= count - 2; i++) {
			Number3 = Number1 + Number2;
			System.out.print(" " + Number3);
			Number1 = Number2;
			Number2 = Number3;
		}
	}
}