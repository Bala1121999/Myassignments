package practise;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		String str1 = "stop";
		String str2 = "post";
		char s1[] = str1.toLowerCase().toCharArray();
		char s2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		boolean s3 = Arrays.equals(s1, s2);
		if(s3==true) {
		System.out.println("is a anagram");	
		}else {
			System.out.println("not a anagram");
		}

	}

}
