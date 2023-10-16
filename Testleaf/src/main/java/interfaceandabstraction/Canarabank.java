package interfaceandabstraction;

public abstract class Canarabank implements Payments{
	
	public void  recordPaymentDetails() {
		System.out.println("details of payments");
	}
	
	public abstract  void amount();
	

}
