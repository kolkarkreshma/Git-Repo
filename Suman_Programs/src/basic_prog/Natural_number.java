package basic_prog;

public class Natural_number {
	public static void main(String[] args) {
		int num=45, sum=0;
		for(int i=1; i<=num; i++) {
			sum=sum+i;
		}
		System.out.println("sum of "+num+"natural numbers"+sum);
	}
}
