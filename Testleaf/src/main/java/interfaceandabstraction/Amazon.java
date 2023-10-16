package interfaceandabstraction;

public class Amazon extends Canarabank{

	@Override
	public void cashOnDelivery() {
		System.out.println("cashOnDelivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("card payments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internet banking");
		
	}

	@Override
	public void amount() {
		System.out.println("20000");
		
	}
public static void main(String[] args) {
	Amazon ama = new Amazon();
	ama.amount();
	ama.cardPayments();
	ama.cashOnDelivery();
	ama.internetBanking();
	ama.upiPayments();
	ama.recordPaymentDetails();
	
}
}
