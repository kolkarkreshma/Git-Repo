package sample;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner   input=new  Scanner(System.in);
		int n=input.nextInt();
		
		
		System.out.println("Even Numbers:");
		for(int i=2; i<=n; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("odd numbers: ");
		for(int j=1; j<=n; j=j+2) {
			System.out.println(j);
		}
	}
	}























































































































































































































































































































































































































































































































//		 int[] arr = {12, 11, 13, 5, 6, 7};
//	        mergeSort(arr);
//	        System.out.println("Sorted array:");
//	        for (int num : arr) {
//	            System.out.print(num + " ");
//	        }
//	    }
//	    
//	    static void mergeSort(int[] arr) {
//	        if (arr.length < 2) return;
//	        
//	        int mid = arr.length / 2;
//	        int[] left = new int[mid];
//	        int[] right = new int[arr.length - mid];
//	        
//	        System.arraycopy(arr, 0, left, 0, mid);
//	        System.arraycopy(arr, mid, right, 0, arr.length - mid);
//	        
//	        mergeSort(left);
//	        mergeSort(right);
//	        
//	        merge(arr, left, right);
//	    }
//	    
//	    static void merge(int[] arr, int[] left, int[] right) {
//	        int i = 0, j = 0, k = 0;
//	        
//	        while (i < left.length && j < right.length) {
//	            if (left[i] <= right[j]) {
//	                arr[k++] = left[i++];
//	            } else {
//	                arr[k++] = right[j++];
//	            }
//	        }
//	        
//	        while (i < left.length) {
//	            arr[k++] = left[i++];
//	        }
//	        
//	        while (j < right.length) {
//	            arr[k++] = right[j++];
//	        }
//		
