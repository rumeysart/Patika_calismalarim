package objectOrientedProgramming;

public class Main_one {

	public static void main(String[] args) {
		/*Book harrypotter = new Book("Harry Potter", 150);
		Book lordoftheRings = new Book("Lord of the Rings", -100);
		lordoftheRings.changePageNumber(-1000);
		System.out.println(lordoftheRings.showPageNumber());
		System.out.println(lordoftheRings.showName());
	*/
		Student st1 = new Student("Cemil", "Çetindağ", "123", "AA", 85);
		Student st2 = new Student("Bedirhan", "Ozturk", "124", "BA", 84);
		Student st3 = new Student("aKIF", "Yilmaz", "148", "DC", 16);
		
		//System.out.println(st3.getGrade());
		
		
		instructor teacher = new instructor("Mahmut", "Cetindag", "CENG");
		//AGGRETATION ÖRNEĞİ
		//instructor t2 = new instructor("a", "b", "CENG");
		
		//composition --> motor sınıfı olmadan araba sınıfı oluşturulamaz
		//Composition , aggretation (ikisi de has a örneği)
		
		//Course has a Instructor (Sınıfın bir öğretmeni vardır)
		Course mat = new Course("MAT101", "MAT",teacher);

		//Kalıtım (inheritance) => is a
		
		System.out.println(mat.getInstructor().getName());
		//Student[] stu = {st1, st2, st3};
		
		//System.out.println("Ort:" + mat.calcAverage(stu));
		
	}

}
