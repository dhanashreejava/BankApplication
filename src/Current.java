
public class Current extends Account{
	private int current_id;
	private String current_Comapny_Name;
	public int getCurrent_id() {
		return current_id;
	}
	public void setCurrent_id(int current_id) {
		this.current_id = current_id;
	}
	public String getCurrent_Comapny_Name() {
		return current_Comapny_Name;
	}
	public void setCurrent_Comapny_Name(String current_Comapny_Name) {
		this.current_Comapny_Name = current_Comapny_Name;
	}
	
	public String toString() {
		return " Your Bank Current id "+ getCurrent_id() +"\n Your Company name is "+getCurrent_Comapny_Name();
				}

}
