/*
 * Bubble Sort is the simplest sorting algorithm that works 
 * by repeatedly swapping the adjacent elements if they are in wrong order. 
 */
package com.sort;

import java.util.Scanner;

public class BubbleSort {

	//*****LOGIC*****
	public void bubbleSort(int arr[]) {
		
		int size = arr.length;
		for(int a = 0; a < size-1; a++) {
			for(int b = 0; b < size-a-1; b++) {
				if(arr[b] > arr[b+1]) {
					int temp = arr[b];
					arr[b] = arr[b+1];
					arr[b+1] = temp;
				}
			}
		}
		
	}
	//*****END*****
	
	
	public static void main(String[] args) {
		
		BubbleSort bs = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int n = sc.nextInt();
		int list[] = new int[n];
		System.out.println("Enter elements to sort:\n");
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		bs.bubbleSort(list);
		System.out.println("Sorted array:\n");
		for(int k:list) {
			System.out.print(k+"\t");
		}
		sc.close();
	}
}
