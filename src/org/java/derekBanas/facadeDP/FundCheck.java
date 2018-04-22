package org.java.derekBanas.facadeDP;

public class FundCheck {
	private  double cashInAccount = 1000.00;
	
	public double getCashInAccount(){
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn){
		cashInAccount -= cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposite){
		cashInAccount += cashDeposite;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawal){
		if(cashToWithdrawal > getCashInAccount()){
			System.out.println("Error: You don't have enough money");
			System.out.println("Current Balance: " + getCashInAccount());
			
			return false;
		}else{
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdrawal Complete: Current balance is "+ getCashInAccount());
			
			return true;
		}
	}
	
	public void makeDeposite(double cashTodeposite){
		increaseCashInAccount(cashTodeposite);
		System.out.println("Deposite Complete: Current Balance is "+ getCashInAccount());
	}
}
