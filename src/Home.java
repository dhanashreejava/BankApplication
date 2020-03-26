
public class Home extends Loan{
	final float intrest=10.f;
	Home()
	{
		System.out.println("Enter the Loan amt for home");
		int amt=sc.nextInt();
		float amt1=amt/100;
		float fianal1=intrest*amt1;
		System.out.println("Monthly you have to pay "+fianal1/12);
		
		
	}
	@Override
	public String toString() {
		return "On saving Acccount "+getLoan_SavingAcc_no();
	}
	

}
