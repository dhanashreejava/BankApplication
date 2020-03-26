import java.util.Scanner;

public class Loan extends Account {
	Scanner sc=new Scanner(System.in);
    private int loan_SavingAcc_no;

	public int getLoan_SavingAcc_no() {
		return loan_SavingAcc_no;
	}

	public void setLoan_SavingAcc_no(int loan_SavingAcc_no) {
		this.loan_SavingAcc_no = loan_SavingAcc_no;
	}
    void purpose()
    {
    	System.out.println("1)car loan 2)Home loan 3)Education loan");
    	int ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:Car c=new Car();
    		break;
    	case 2:
    		  Home h=new Home();
    		break;
    	case 3:
    		Education E=new Education();
    		break;
    	case 4:
    		return;
    		
    	}
    }
   
  
}
