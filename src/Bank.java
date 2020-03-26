
public class Bank {
	private String bank_Name;
   private  String bank_Branch_Name;
   private  String bank_IFSC;
   private  String bank_MICR;
	public String getBank_Name() {
		return bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public String getBank_Branch_Name() {
		return bank_Branch_Name;
	}
	public void setBank_Branch_Name(String bank_Branch_Name) {
		this.bank_Branch_Name = bank_Branch_Name;
	}
	public String getBank_IFSC() {
		return bank_IFSC;
	}
	public void setBank_IFSC(String bank_IFSC) {
		this.bank_IFSC = bank_IFSC;
	}
	public String getBank_MICR() {
		return bank_MICR;
	}
	public void setBank_MICR(String bank_MICR) {
		this.bank_MICR = bank_MICR;
	}
    
	public String toString() {
		return " Your Bank name is "+ getBank_Name() +"\n Your Branch name is "+getBank_Branch_Name()+"\n Your Banke IFSC code is "+getBank_IFSC()+"\n Your MICR code is"+getBank_MICR();
				}

}
