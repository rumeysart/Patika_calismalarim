package objectOrientedProgramming;

public class Course {
	/*
	 * bir sınıfa ait parametrelerden biri başka
	 * bir sınıfı temsil ediyorsa bu sınıf o sınıfı
	 * içerir. Buna composition deniyor
	 * 
	 */
	private String courseName;
	private String code;
	private instructor instructor;
	
	public Course(String courseName, String code, instructor instructor) {
		this.courseName = courseName;
		this.code = code;
		this.instructor = instructor;
	}

	public instructor getInstructor() {
		return this.instructor;
	}

	public void setInstructor(instructor instructor) {
		this.instructor = instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	//course sınıfı içindeki bir methodta parametre olarak başka bir method
	//aldığı için Course uses a Student diyebiliriz
	// (bu da Course sınıfı Student sınıfına bağlı demektir!)
	//iki sınıf birbirine bağlı - dependence -
	public double calcAverage(Student[] students) {
		Student st4 = new Student("", "", "", "", 123);
		double avarage = 0;
		for(int i = 0; i < students.length; i++) {
			avarage += students[i].getGrade();
		}
		return avarage / students.length;
	}
}
