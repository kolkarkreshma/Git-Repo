package basic_prog;

public class Factorial_Number {
	public static void main(String[] args) {
		int num=6;
		int fact=1;
		
		for(int i=1; i<=num; i++) {
			fact*=i;
		}
		System.out.println("Factorial number of"+num+"is"+fact);
	}

}
