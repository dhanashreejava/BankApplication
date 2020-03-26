import java.util.Scanner;

public class FD extends Account{




	Scanner sc=new Scanner(System.in);
	private String fD_no;
	private int fd_amt;
	private String fd_issue;
	private String fd_due;
	private int fd_period;

	public String getfD_no() {
		return fD_no;
	}
	public void setfD_no(String fD_no) {
		this.fD_no = fD_no;
	}
	public int getFd_amt() {
		return fd_amt;
	}
	public void setFd_amt(int fD_amt) {
		this.fd_amt = fD_amt;
	}
	public String getFd_issue() {
		return fd_issue;
	}
	public void setFd_issue(String fd_issue) {
		this.fd_issue = fd_issue;
	}
	public String getFd_due() {
		return fd_due;
	}
	public void setFd_due(String fd_due) {
		this.fd_due = fd_due;
	}
	public int getFd_period() {
		return fd_period;
	}
	public void setFd_period(int fd_period) {
		this.fd_period = fd_period;
	}


	void FD1()
	{
		final float  intersert=6.0f;
		System.out.println("-----------------------");
		float fd1=fd_amt/100;
		fd1=fd1*intersert;
		fd1=fd1/12;


		System.out.println("1)Monthaly /n 2)Currently");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Monthly you will get  "+fd1+"rs");

			break;
		case 2:
			System.out.println("In year you will get "+fd1*12);
			break;

		}
	}
	
	

}
