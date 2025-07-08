package basic_prog;

import java.util.Arrays;

public class ReArange {
	public static void main(String[] args) {
		int a[] = {8,9,7,6,4,5};
		//output : {7,6,4,5,8,9}
		int k=2;
		while(k!=0) {
			for(int i=0; i<a.length-1; i++) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}
			k--;
		}
		System.out.println(Arrays.toString(a));
																																	
	}

}
 