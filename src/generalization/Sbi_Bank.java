package generalization;

public class Sbi_Bank implements Rbi_Bank , Rbi_Bank2 {

	@Override
	public void minCreditScore() {
		// TODO Auto-generated method stub
		System.out.println("min credit score 700");
	}

	@Override
	public void personalLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println(" personal loan rate 12.3%");
	}

	@Override
	public void homeLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println(" home loan rate 7%");
	}
	
	@Override
	public void minCreditScore1() {
		// TODO Auto-generated method stub
		System.out.println("min credit score 700");
	}
	
	public void rbicoad() {
		
		System.out.println(Rbi_Bank.rbiCode);
	}
    
	public void rbicoad1() {
		
		System.out.println(Rbi_Bank2.rbiCode);
	}


	@Override
	public String thankToCustomer() {

		return Rbi_Bank.super.thankToCustomer();
	}
	
	

}
