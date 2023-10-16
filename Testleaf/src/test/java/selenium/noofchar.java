package selenium;

public class noofchar {

	public static void main(String[] args) {
		String data = "testleaf";
		char[] data1 = data.toCharArray();
		int len = data.length();
		char input = 'z';
		int count =0;
		for(int i=0;i<len;i++) {
			
				if(data1[i]==input) {
					
					count++;
				}
			}
		System.out.println("the count of e is" + count );
		}

	}


