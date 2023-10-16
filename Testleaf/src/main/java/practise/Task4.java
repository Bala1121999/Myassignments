package practise;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task4 {

	public static void main(String[] args) {
		String data = "google";
		char []data1 = data.toCharArray();
		Set<Character> char1 = new LinkedHashSet<Character>();
		Set<Character> char2 = new LinkedHashSet<Character>();
		for(char name:data1) {
			if(!char1.add(name)) {
				char2.add(name);
			}
		}
		System.out.println(char1);
		System.out.println(char2);
		
		

	}

}
