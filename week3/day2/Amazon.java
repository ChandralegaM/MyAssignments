package week3.day2;

public class Amazon extends CanaraBank {


	@Override
	public void recordPaymentsDetails() {
		System.out.println("recorderd");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon web =new Amazon();
		web.cardPaymets();
		web.cashOnDelivery();
		web.internetBanking();
		web.kyc();
		web.recordPaymentsDetails();
	}


}
