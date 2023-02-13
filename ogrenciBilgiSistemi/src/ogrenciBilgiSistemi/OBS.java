package ogrenciBilgiSistemi;

public class OBS {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
		Teacher t2 = new Teacher("Kulyutmaz Hoca", "BIO", "547");
		Teacher t3 = new Teacher("Einstein Hoca", "FZK", "815");

		
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);
		
		Course bio = new Course("Biology", "103", "BIO");
		bio.addTeacher(t2);

		
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t3);
	
		Student s1 = new Student("Inek Saban", "1213", "4", tarih, fizik, bio);
		s1.addBulkExamNote(100, 10, 50, 77, 40, 63);
		s1.isPass();
		
		Student s2 = new Student("Guduk Necmi", "44", "4", tarih, fizik, bio);
		s2.addBulkExamNote(47, 99, 78, 33, 45, 84);
		s2.isPass(); 
		
	}

}
