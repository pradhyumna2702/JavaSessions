package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hd=new HDFCBank();
		hd.credit();
		hd.debit();
		hd.loan();
		hd.funds();
		
		
		Bank b=new HDFCBank();
		b.loan();
		b.debit();
		b.credit();
		
	
	}

}
