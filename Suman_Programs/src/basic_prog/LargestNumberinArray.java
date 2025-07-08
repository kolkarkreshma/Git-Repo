package basic_prog;

public class LargestNumberinArray {
	 public static void main(String[] args) {
	        int[] arr = {10, 20, 4, 45, 99};
	        int largest = arr[0];
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                largest = arr[i];
	            }
	        }
	        
	        System.out.println("Largest element is " + largest);
	    }
	} 


 