
public class Car extends Loan {
	final float intrest=9.f;
	Car()
	{
		System.out.println("Enter the Loan amt for car");
		int amt=sc.nextInt();
		float amt1=amt/100;
		float fianal1=intrest*amt1;
		System.out.println("Monthly you have to pay "+fianal1/12);
		
		
	}
	public String toString() {
		return "On saving Acccount "+getLoan_SavingAcc_no();
	}
}
