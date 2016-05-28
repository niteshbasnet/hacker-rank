package com.gm.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Hacker Rank Data Structure Solution
 */
public class DataStructure {
	public static void main(String[] args) {
		// Array DS solution

//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int arr[] = new int[n];
//		for (int arr_i = 0; arr_i < n; arr_i++) {
//			arr[arr_i] = in.nextInt();
//		}
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}

		// 2D Array DS solution
//		Scanner in = new Scanner(System.in);
//		int arr[][] = new int[6][6];
//		for (int arr_i = 0; arr_i < 6; arr_i++) {
//			for (int arr_j = 0; arr_j < 6; arr_j++) {
//				arr[arr_i][arr_j] = in.nextInt();
//			}
//		}
//
//		int max = -64;
//		int sum = 0;
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
//						+ arr[i + 2][j + 2];
//				max = Math.max(max, sum);
//			}
//		}
//		System.out.println(max);

		// Dyanamic Array solution
		
		// Sparse Arrays
		Scanner in = new Scanner(System.in);
		int numOfString = in.nextInt();
		ArrayList<String> strArray = new ArrayList<String>();
		in.nextLine();
		for (int i = 0; i < numOfString; i++) {
			strArray.add(in.nextLine());
		}

		int numOfQueries = in.nextInt();
		ArrayList<String> queries = new ArrayList<String>();
		in.nextLine();
		for (int i = 0; i < numOfQueries; i++) {
			queries.add(in.nextLine());
		}
		
		ArrayList<Integer> countList = new ArrayList<Integer>();
		for (int i = 0; i < queries.size(); i++) {
			int count = 0;
			for (int j = 0; j < strArray.size(); j++) {
				if (strArray.get(j).equals(queries.get(i))) {
					countList.add(i, count++);
				}
			}
		}
		System.out.println("Counts::"+countList);
	}

}
