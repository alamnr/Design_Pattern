package org.java.derekBanas.facadeDP;

public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck accountNumberChecker;
	SecurityCodeCheck securityCodeChecker;
	FundCheck fundChecker;
	
	WelcomeToBank welcomeToBank;
	
	public BankAccountFacade(int newAcctNum, int newSecCode){
		
		accountNumber = newAcctNum;
		securityCode = newSecCode;
		
		welcomeToBank =  new WelcomeToBank();
		accountNumberChecker = new AccountNumberCheck();
		securityCodeChecker = new SecurityCodeCheck();
		fundChecker = new FundCheck();
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public int getSecurityCode(){
		return securityCode;
	}
	
	public void withdrawCash(double cashToGet){
		if(accountNumberChecker.accountActive(getAccountNumber())&&
				securityCodeChecker.isCodeCorrect(getSecurityCode())&&
				fundChecker.haveEnoughMoney(cashToGet)){
			
			System.out.println("Transaction Cmplete \n");
		}else{
			System.out.println("Transaction Failed \n");
		}
	}
	
	public void depositCash(double cashToDeposite){
		if(accountNumberChecker.accountActive(getAccountNumber())&&
				securityCodeChecker.isCodeCorrect(getSecurityCode())){
			fundChecker.makeDeposite(cashToDeposite);
			System.out.println("Transaction Cmplete \n");
			
		}else{
			System.out.println("Transaction Failed \n");
		}
	}

}
