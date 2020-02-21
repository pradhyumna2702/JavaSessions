package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		
		System.out.println(USBank.min_bal);
		
		
		//Static Polymorphism
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.homeLoan();
		
		
		System.out.println("*********");
		
		
		//Dynamic Polumorphism
		//If a class is implementing any interface then its mandatory to override(Define) all the methods of the interface.
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		System.out.println("*********");
		
		
		
		
		
		
		
	}

}
