package generalization;

public class Hdfc_Bank implements Rbi_Bank {

	@Override
	public void minCreditScore() {
		// TODO Auto-generated method stub
		System.out.println("min credit score 730");
		
		
	}

	@Override
	public void personalLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println(" personal loan rate 12%");
	}

	@Override
	public void homeLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println(" home loan rate 6.7%");
	}

}
