package basic_prog;

import java.util.Scanner;

public class PrintEvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner   input=new Scanner(System.in);
		int n=input.nextInt();
		
		System.out.println("even numbers: ");
		for(int i=2; i<=n; i=i+2) {   // 2+2=4+2=6+2+8 it will like this
			System.out.println(i); //2 4 6 8 10.........n
			}
		System.out.println("odd numbers: ");
		for(int j=1; j<=n; j=j+2) {  // 1+2=3+2=5+2+7 it will like this
			System.out.println(j); //1 3 5 7 9.........n
			
			}
		
	}

}
