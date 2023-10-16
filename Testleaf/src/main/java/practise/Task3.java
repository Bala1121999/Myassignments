package practise;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int data[]= {23,5,67,20,3,30,79,3,70,2};
		System.out.print("original array:" + Arrays.toString(data));
		Arrays.sort(data);
		for(int i=data.length-1;i>=0;i--) {
			System.out.print(data[i]+",");
		}
		
	}

}
