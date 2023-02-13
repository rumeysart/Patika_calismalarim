package ogrenciBilgiSistemi;

public class Teacher {
	String name;
	String mpno;
	String branch;
	
	Teacher(String Name, String Branch, String Mpno){
		this.name = Name;
		this.mpno = Mpno;
		this.branch = Branch;
		
	}

	void print() {
		System.out.println("Adi: " + this.name);
		System.out.println("Telefonu:" + this.mpno);
		System.out.println("Bolumu: " + this.branch);
	}
}
