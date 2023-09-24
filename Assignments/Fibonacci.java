package week1.Assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int firstterm = 0;
		int secondterm = 1;
		int n = 10;
		System.out.println("fibonicc series range upto"+n);
		for(int i = 1;i < n;i++) {
			System.out.print(firstterm+",");
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
			
		}
	}

}
