import java.util.Scanner;

public class Test {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("Welcome to Banking Application");
		System.out.println("-----------------------------------------");
		System.out.println("  1)Entering Banking details \n  2)Enter the saving Account details \n  3)Enter Current Account details \n  4)Enter the loan number \n  5)Enter FD Account details");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			Bank b=new Bank();
			accept(b);
			break;
		case 2:
			Saving s=new Saving();
			accept(s);
   
			break;
		case 3:
			Current c=new Current();
			accept(c);
			break;
		case 4:
			Loan l=new Loan();
			accept(l);
			break;
		case 5:
			FD f=new FD();
			accept(f);
			break;


		}

	}
	static void accept(Bank b)
	{
		System.out.println("Enter the Bank Information");
		System.out.println("Enter the Bank_Name \n");
		b.setBank_Name(sc.next());
		System.out.println("Enter the Branch_Name \n");
		b.setBank_Branch_Name(sc.next());
		System.out.println("Enter the Bank_IFSC code \n");
		b.setBank_MICR(sc.next());
		System.out.println("Enter the Bank_MICR code \n");
		b.setBank_IFSC(sc.next());
		
		if(b instanceof Saving)
		{
			System.out.println("Enter saving id ");
			((Saving) b).setSaving_id(sc.nextInt());
			System.out.println("Enter saving limit");
			((Saving) b).setSaving_limit(sc.nextInt());
			if(((Saving) b).getSaving_limit()<=1000)
			{
				System.out.println("Sorry your amt is low");
			}
			else
			{
				System.out.println(b);
			}

		}
		if(b instanceof Current)
		{
			System.out.println("Enter Current account id");
			((Current) b).setCurrent_id(sc.nextInt());
			System.out.println("Enter your company name");
			((Current) b).setCurrent_Comapny_Name(sc.next());
			System.out.println(b);
		}
		if(b instanceof Loan)
		{
			System.out.println("Enter your Saving Account number");
			int s=sc.nextInt();
			((Loan) b).purpose();
			System.out.println(b);
		}
		if(b instanceof FD)
		{
			System.out.println("Enter the FD number");
			((FD) b).setfD_no(sc.next());
			System.out.println("Enter the FD amt");
			((FD) b).setFd_amt(sc.nextInt());
			System.out.println("FD issue date");
			((FD) b).setFd_issue(sc.next());
			System.out.println("Enter the due date");
			((FD) b).setFd_due(sc.next());
			System.out.println("Enter the time peroids");
			((FD) b).setFd_period(sc.nextInt());
			((FD) b).FD1();
			System.out.println(b);
		}

		

	}
	
	
}
