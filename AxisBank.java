package assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Axis Bank Deposit");
	}
	
	public static void main(String[] args) {
		
		AxisBank b =new AxisBank();
		b.saving();
		b.fixed();
		b.deposit();
		
		
	}

}
