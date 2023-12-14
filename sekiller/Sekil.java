package sekiller;

public class Sekil {
	String name;
	String color;
	double side1 = 1;
	double side2 = 1;
	double area = 1, p =1;
	
	Sekil(String n, String c, double s1, double s2){
		this.side1 = s1;
		this.color = c;
		this.name = n;
		this.side2 = s2;
		
	}
	
	void find() {
		
	}
	
	void print() {
		System.out.println("name: " + this.name + "color: " + this.color);
	}
	
	
}
