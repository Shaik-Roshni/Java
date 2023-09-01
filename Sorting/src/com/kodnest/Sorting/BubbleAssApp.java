package com.kodnest.Sorting;

import java.util.Scanner;

public class BubbleAssApp {
	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Sorting sorting=new Sorting();
		sorting.bubbleSort(arr);
		System.out.println("array elements after sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	}

