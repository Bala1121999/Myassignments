package practise;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int data[]= {23,5,67,20,3,30,79,3,70,2};
		//arrays.sort used to sort a array in ascending order.
		Arrays.sort(data);
		//Arrays.tostring represent as string in array 
		System.out.println(Arrays.toString(data));
		for(int i =0;i< data.length;i++) {
			System.out.print(data[i]+ ",");
		}
		System.out.println(data[5]);
}
	
}