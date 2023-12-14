package objectOrientedProgramming;

public class instructor {
	private String name;
	private String surname;
	private String department;
	
	public instructor(String name, String surname, String department)
	{
		this.name = name;
		this.surname = surname;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setSurname(String department) {
		this.department = department;
	}

	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}
	
}
