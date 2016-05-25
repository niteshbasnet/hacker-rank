package com.gm.datastructure;

import java.util.Scanner;

public class DataStructure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int [] a = {};
		for (int j = 0; j < i; j++) {
			a[j] = sc.nextInt();
		}
		for (int j : a) {
			System.out.println(j);
		}
		sc.close();
	}

}
