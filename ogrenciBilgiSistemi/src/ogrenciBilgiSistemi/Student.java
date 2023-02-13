package ogrenciBilgiSistemi;

public class Student {
	Course c1;
	Course c2;
	Course c3;

	
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;
	
	Student(String name, String stuNO, String classes, Course c1, Course c2, Course c3){
		this.name = name;
		this.stuNo = stuNO;
		this.classes = classes;
		
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		calcAvarage();
		this.isPass= false;
	}
	
	void addBulkExamNote(int note1, int note2, int note3, int sozlu1, int sozlu2, int sozlu3) {
		if((note1 >= 0 && note1 <= 100)&& (sozlu1 >= 0 && sozlu1<=100)) {
			this.c1.note = note1;
			this.c1.sozlu = sozlu1;
		}
		if((note2 >= 0 && note2 <= 100)&& (sozlu2 >= 0 && sozlu2<=100)) {
			this.c2.note = note2;
			this.c2.sozlu = sozlu2;
		}
		if((note3 >= 0 && note3 <= 100) && (sozlu3 >= 0 && sozlu3<=100)) {
			this.c3.note = note3;
			this.c3.sozlu = sozlu3;
		}
	}
	void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0 || this.c1.sozlu == 0|| this.c2.sozlu == 0 || this.c3.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            System.out.println();
            if (this.isPass) {
                System.out.println("Sinifi Gecti");
            } else {
                System.out.println("Sinifta Kaldi");
            }
        }
    }
	
	void calcAvarage() {
		this.avarage = ((((this.c1.note)*0.8) + ((this.c1.sozlu)*0.2) + (((this.c2.note)*0.8) + ((this.c2.sozlu)*0.2) + (((this.c3.note)*0.8)+ ((this.c3.sozlu)*0.2)))))/3.0;
	}
	
	boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}
	
	void printNote() {
		System.out.println("Ogrenci: " + this.name);
		System.out.println(c1.name + " Notu: \t" + this.c1.note);
		System.out.println(c2.name + " Notu: \t" + this.c2.note);
		System.out.println(c3.name + " Notu: \t" + this.c3.note);
		System.out.println("Ortalamaniz: " + this.avarage);

	}
}
