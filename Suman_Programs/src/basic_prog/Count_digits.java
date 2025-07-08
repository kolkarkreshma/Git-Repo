package basic_prog;

public class Count_digits {
	public static void main(String[] args) {
		int num=123434654;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
