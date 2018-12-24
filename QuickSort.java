/*
 * Quick Sort Algorithm Implementation
 * 
 * Choose the first index value has pivot
 * Take two variables to point left and right of the list excluding pivot
 * left points to the low index
 * right points to the high
 * while value at left is less than pivot move right
 * while value at right is greater than pivot move left
 * if both step 5 and step 6 does not match swap left and right
 * if left is greater than or equal to right, the point where they met is new pivot
 * 
 */
package com.sort;

import java.util.Scanner;

public class QuickSort {
	
		public void applyQuickSort(int newList[]) {
			quickSort(newList, 0, newList.length-1);
		}
		
		public void quickSort(int arr[], int firstIndex, int lastIndex) {
		
		int low = firstIndex;
		int high = lastIndex;
		int pivot = arr[(low+high)/2];
		
		while(low <= high) {
			while(arr[low] < pivot) {
				low = low+1;
			}
			while(arr[high] > pivot) {
				high = high-1;
			}
			if(low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			
				low++;
				high--;
			}
	    }
		if(firstIndex < high) {
			quickSort(arr,firstIndex,high);
		}
		if(low < lastIndex) {
			quickSort(arr, low, lastIndex);
		}

	}
	
	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		int list[] = new int[5];
		System.out.println("Enter 5 elements to sort :\n");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			list[i]=sc.nextInt();
		}
		//qs.quickSort(list,0,list.length-1);
		qs.applyQuickSort(list);
		System.out.println("Elements after sorting : /n");
		for(int k=0; k<5; k++) {
			System.out.print(list[k]+"\t");
		}
		sc.close();

	}

}
