package oops;

public class Overloading {
	
	public void  reportStep(String msg , String sts) {
		System.out.println("Message is" + msg );
		System.out.println("status is "+ sts);
	}
	
	public void  reportStep(String msg , String sts,Boolean snap) {
		System.out.println("Message is" + msg );
		System.out.println("status is "+ sts);
		System.out.println("need to take snap "+ snap);
	}
	
	public static void main(String[] args) {
		Overloading ovr = new Overloading();
		ovr.reportStep("hi", "in progress");
		ovr.reportStep("hellow", "completed", false);
	}
	
}
