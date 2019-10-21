package classesandobjects;

public class AccountHolder {
	String FirstName;
	String LastName;
	int Age;
	float AccountBalance;
	boolean EligibleForCreditCard;
	
	public void testEligibleForCreditCard() {
		if (Age>25 && AccountBalance >=20000)
		{
			EligibleForCreditCard=true;
		}
	}

}
