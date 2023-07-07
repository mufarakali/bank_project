package bankproject;


public class bank {
	private int AcNo;
	private String Name;
    private	double Bal;
  /* bank(int acno,String name,double bal)
    {
    	 AcNo=acno;
    	 Name=name;
    	 Bal=bal;
    }*/
        
	public int getAcNo() {
		return AcNo;
	}
	public void setAcNo(int AcNo) {
		this.AcNo = AcNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public double getBal() {
		return Bal;
	}
	public void setBal(double Bal) {
		this.Bal = Bal;
	}
	@Override
	public String toString() {
		return "bank [AcNo=" + AcNo + ", Name=" + Name + ", Bal=" + Bal + "]";
	}
	
	
}
