package basic_prog;

public class Armstrong_Number {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int rem,sum=0;
		
		while(num>0) {
			rem=num%10;
		    num=num/10;
		   sum= sum+rem*rem*rem;
		}
		if(temp==sum)
		System.out.println("it is an armstrong number");
		else 
			System.out.println("it is not armstrong  num");
		
	}

}
