package generalization;

public class Icici_Bank implements Rbi_Bank{

	@Override
	public void minCreditScore() {
		System.out.println("min credit score 710");
		
	}

	@Override
	public void personalLoanInterest() {
		System.out.println(" personal loan rate 11.5%");
		
	}

	@Override
	public void homeLoanInterest() {
		System.out.println(" home loan rate 6.5%");
		
		
	}

}
