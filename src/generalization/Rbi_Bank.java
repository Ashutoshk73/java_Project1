package generalization;

public interface Rbi_Bank {
	
	String rbiCode = "1234";
	void minCreditScore();
	void personalLoanInterest();
	void homeLoanInterest();
	
	default String thankToCustomer()
	{
		return " Thank you for showing intrest";
	}

}
