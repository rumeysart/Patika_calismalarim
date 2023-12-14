package objectOrientedProgramming;

public class Student {
	
	private String name;
	private String surname;
	private String idNo;
	private String adress;
	private int grade;

	public Student(String name, String surname, String idNo, String adress, int grade)
	{
		this.name = name;
		this.surname = surname;
		this.idNo = idNo;
		this.adress = adress;
		if(grade < 0 || grade > 100)
		{
			grade = 0;
		}
		this.grade = grade;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	public String getidNo()
	{
		return this.idNo;
	}
	public void setidNo(String idNo)
	{
		this.idNo = idNo;
	}
	public String getAdress()
	{
		return this.adress;
	}
	public void setAdress(String adress)
	{
		this.adress = adress;
	}
	public int getGrade()
	{
		return this.grade;
	}
	public void setgrade(int grade)
	{
		this.grade = grade;
	}
	
}
