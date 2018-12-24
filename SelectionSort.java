/*
 * List is divided into two parts, the sorted part at the left end and the unsorted part at the right end 
 * The smallest element is selected from the unsorted array and swapped with the leftmost element
 * This process continues moving unsorted array boundary by one element to the right.
 */
package com.sort;

import java.util.Scanner;

public class SelectionSort {

	//*****LOGIC*****
	public void selectionSort(int arr[]) {
		
		int size = arr.length;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	//*****END*****
	
	public static void main(String[] args) {

		SelectionSort ss = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int n = sc.nextInt();
		int list[] = new int[n];
		System.out.println("Enter elements to sort:\n");
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		ss.selectionSort(list);
		System.out.println("Sorted array:\n");
		for(int k:list) {
			System.out.print(k+"\t");
		}
		sc.close();
	}
}
