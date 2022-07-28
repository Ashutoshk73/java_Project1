package generalization;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rbi_Bank k = new Sbi_Bank();
		System.out.println("1) Sbi Bank");
		
		k.minCreditScore();
		k.personalLoanInterest();
		k.homeLoanInterest();
		System.out.println(k.rbiCode);
		System.out.println(k.thankToCustomer());
		
		k = new Hdfc_Bank();
		System.out.println(" 2) Hdfc Bank");
		k.minCreditScore();
		k.personalLoanInterest();
		k.homeLoanInterest();
		System.out.println(k.thankToCustomer());
		
		k = new Icici_Bank();
		System.out.println(" 3) Icici Bank");
		k.minCreditScore();
		k.personalLoanInterest();
		k.homeLoanInterest();
		System.out.println(k.thankToCustomer());


	}

}
