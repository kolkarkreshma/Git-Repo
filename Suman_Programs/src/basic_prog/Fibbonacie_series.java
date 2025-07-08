 package basic_prog;

public class Fibbonacie_series {
	public static void main(String[] args) {
		int num=5, first=0,second=1;
		System.out.print("fibbonaccie series"+first+""+second);
		
		
		for(int i=3; i<=num; i++) {
			int next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
		}
	}

}
