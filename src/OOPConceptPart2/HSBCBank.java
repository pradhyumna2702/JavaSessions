package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank{// We are achieving multiple inheritance(IS -A relationship)

	
	//First 3 methods are overring from us bank
	public void credit() {
		System.out.println("Credit method");
		
	}

	public void debit() {
		System.out.println("debit method");
	}	

	public void transferMoney() {
		System.out.println("transfermoney method");

	}
	
	//these 2 methods are from hsbc bank 
	public void homeLoan() {
		System.out.println("homeLoan method");

	}
	
	public void educationLoan() {
		System.out.println("educationLoan method");

	}
	
	//this method is over ridden from brazil bank
	public void mutualFund() {
		System.out.println("Mutual fund method");

	}

}
