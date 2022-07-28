package generalization;

public interface Rbi_Bank2 {
	
	String rbiCode = "4321";
	
	void minCreditScore1();
	
	default String thankToCustomer()
	{
		return " Thank you for showing intrest";
	}


}
