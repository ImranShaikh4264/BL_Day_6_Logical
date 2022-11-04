package com.bridgelab.day6.logical;

import java.util.Scanner;

public class PerfectNumber {
	public static int getSumOfFactor(int Number) {
		int Num = Number;
		int total=0;
		for (int i =1; i< Num;i++) {
			if(Num%i==0) {
				//System.out.println(i);
				total =total+i;
			}
		}
		return total;
	}
	public static void checkPerfect(int Number,int total) {
		if(Number==total)
			System.out.println("Given number is perfect number");
		else
			System.out.println("Given number is not perfect number");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int Number = sc.nextInt();
		int total =getSumOfFactor(Number);
		checkPerfect(Number,total);
		
	}


}
