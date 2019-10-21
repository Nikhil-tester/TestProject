package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder Tom =  new AccountHolder();
		AccountHolder Hanery =  new AccountHolder();
		AccountHolder Sarah =  new AccountHolder();
		
		Tom.FirstName = "Tom";
		Tom.LastName = "Smith";
		Tom.Age = 21;
		Tom.AccountBalance = 10000;
		Tom.testEligibleForCreditCard();
		System.out.println("Is Tom Eligible for CC : "+Tom.EligibleForCreditCard);

		Hanery.FirstName = "Hanery";
		Hanery.LastName = "Hill";
		Hanery.Age = 31;
		Hanery.AccountBalance = 20000;
		Hanery.testEligibleForCreditCard();
		System.out.println("Is Hanery Eligible for CC : "+Hanery.EligibleForCreditCard);

		Sarah.FirstName = "Sarah";
		Sarah.LastName = "Magan";
		Sarah.Age = 41;
		Sarah.AccountBalance = 30000;
		Sarah.testEligibleForCreditCard();
		System.out.println("Is Sarah Eligible for CC : "+Sarah.EligibleForCreditCard);

	}

}
