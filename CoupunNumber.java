package com.bridgelab.day6.logical;

import java.util.Scanner;

public class CoupunNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Coupan required to generate");
		int N = sc.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			int randomCheck = (int) (Math.floor(Math.random() * 100) % 100) + 1;
			for (int k = 0; k <= i; k++)
				if (array[k] != randomCheck)
					array[i] = randomCheck;
		}
		for (int j = 0; j < N; j++)
			System.out.print(array[j] + " ");
	}
}
