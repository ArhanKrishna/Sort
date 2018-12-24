/*
 * The array is searched sequentially and unsorted items are moved and inserted into the sorted sub-list
 */
package com.sort;

import java.util.Scanner;

public class InsertionSort {

	//*****LOGIC*****
	public void insertionSort(int arr[]) {
	
		int size = arr.length;
		int key,r;
		
		for(int i=1; i<size; i++) {
			key = arr[i];
			r = i-1;
			while(r >= 0 && arr[r] > key) {
				arr[r+1] = arr[r];
				r = r-1;
			}
			arr[r+1] = key;
		}
	}
	//*****END*****
	
	public static void main(String[] args) {
		
		InsertionSort is = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int n = sc.nextInt();
		int list[] = new int[n];
		System.out.println("Enter elements to sort:\n");
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		is.insertionSort(list);
		System.out.println("Sorted array:\n");
		for(int k:list) {
			System.out.print(k+"\t");
		}
		sc.close();
	}
}
