package inheritance;

public class officer extends Workers{
	
	private String shift;
	
	public officer(String nameSurname, String mp, String eposta, String department, String shift) {
		super(nameSurname, mp, eposta);
		this.department = department;
		this.shift = shift;
	}

	
	private String department;
	public String getDepartment() {
		return department;
	}

	public String getShift() {
		return shift;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}


}
