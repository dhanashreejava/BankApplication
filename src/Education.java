
public class Education  extends Loan{
	final float intrest=8.f;
	Education()
	{
		System.out.println("Enter the Loan amt for Education");
		int amt=sc.nextInt();
		float amt1=amt/100;
		float fianal1=intrest*amt1;
		System.out.println("Monthly you have to pay "+fianal1/12);	
	}
	public String toString() {
		return "On saving Acccount "+getLoan_SavingAcc_no();
	}
}
