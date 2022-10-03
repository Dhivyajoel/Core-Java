package oops;

public class BOABank extends Bank{
	
	public int CreditCardNum;
	
	int AccountNum;
	
	public void CCBalance() {
		
		System.out.println("Inside CC balance");
	
		this.CreditCardNum = 1000;
		super.AccountNum  = 123456;
		this.AccountNum = 7890;
		

	}

}
