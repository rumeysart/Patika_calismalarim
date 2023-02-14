package maasHesaplayici;

public class Employee {
	String name;
	double salary;
	float workHours;
	int hireYear;
	
	Employee(String name, double salary, float workHours, int hireYear){
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
		
	}
	public double tax() {
		// Maaşa uygulanan vergiyi hesaplayacaktır
		if(this.salary > 1000) {
			return salary * 0.03;
		}
		return 0.0;
	}
	public double bonus() {
		double x = 0;
		if(this.workHours-40 > 0) {
			return (this.workHours-40)*30;
		}
		return x;
	}
	public double raiseSalary() {
		int year = 2021;
		if(year-this.hireYear < 10) {
			return salary * 0.05;
		}
		else if((year-this.hireYear > 9) && (year - this.hireYear < 20))
		{
			return this.salary * 0.10;
		}
		else
			return this.salary *0.15;
	}
	
	void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Salary: "+ this.salary);
		System.out.println("Work Hour: " + this.workHours);
		System.out.println("Hire Year: " + this.hireYear);
		System.out.println("Tax: " + this.tax());
		System.out.println("Bonus: " + this.bonus());
		System.out.println("Raise Salary: " + this.raiseSalary());
		System.out.println("Salary with Taxes and Bonus : " + (this.salary - tax() + bonus()));
		System.out.println("Alacaginiz Toplam Maas :" + ((salary + raiseSalary() + bonus()) - tax()) + " TL");
    
	}
	

}
