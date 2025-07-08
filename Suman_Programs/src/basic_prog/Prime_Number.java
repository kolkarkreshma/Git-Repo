package basic_prog;

public class Prime_Number{
	public static void main(String[] args) {
		int num=29;
		boolean isprime=true;
		
		
		for(int i=2; i<=num/2; i++) {
			if(num % i==0) {
				isprime=false;
				
			}
		}
		
		if(isprime)System.out.println(num+"is a prime number");
		else System.out.println(num+"is not a prime number");
	}
}
	