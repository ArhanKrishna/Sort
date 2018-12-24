/*
 * Find the middle point to divide the array into two halves
 * Call mergeSort for first half
 * Call mergeSort for second half
 * Merge the two halves sorted in step 2 and 3
 */

package com.sort;

import java.util.Scanner;

public class MergeSort {
	
	public void mergeList(int arr[], int first, int middle, int last) {
		
		int leftLength = middle - first +1;
		int rightLength = last - middle;
		
		int leftList[]= new int[leftLength];
		int rightList[]= new int[rightLength];
		
		for(int i=0; i<leftLength; i++) {
			leftList[i] = arr[first+i];
		}
		for(int j=0; j<rightLength; j++) {
			rightList[j] = arr[j+middle+1];
		}
		
		int e1=0, e2=0;
		int index = first;
		while(e1 < leftLength && e2 < rightLength) {
			if(leftList[e1] < rightList[e2]) { // Compare values
				arr[index] = leftList[e1];
				e1 = e1+1;
			}else {
				arr[index] = rightList[e2];
				e2 = e2+1;
			}
			index = index + 1;
		}
		while(e1 < leftLength) {
			arr[index] = leftList[e1];
			index = index+1;
			e1=e1+1;
		}
		while(e2 < rightLength) {
			arr[index] = rightList[e2];
			index = index+1;
			e2 = e2+1;
		}
		
	}
	
	public void mergeSort(int arr[],int firstIndex, int lastIndex) {
		
		if(firstIndex < lastIndex) {
			
			int middleIndex = (firstIndex+lastIndex)/2; // middle point
			
			mergeSort(arr,firstIndex,middleIndex); // the first half
			mergeSort(arr, middleIndex+1, lastIndex); // the second half
			
			mergeList(arr, firstIndex, middleIndex, lastIndex);
		}
		
	}
	
	public void applyMergeSort(int arr[]) {
		mergeSort(arr,0,arr.length-1);
	}

	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		int list[] = new int[5];
		System.out.println("Enter 5 elements to sort :\n");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			list[i] = sc.nextInt();
		}
		//ms.mergeSort(list,0,list.length-1);
		ms.applyMergeSort(list);
		System.out.println("Elements after sorting : /n");
		for(int k=0; k<5; k++) {
			System.out.print(list[k]+"\t");
		}
		sc.close();
		
	}

}
