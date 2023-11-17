package inheritance;

public class Main {

	public static void main(String[] args) {
		Workers w1 = new Workers("Mustafa Cetindag", "052121212", "mcetind@mail.com");
		System.out.println(w1.getNameSurname());
		
		Academist a1 = new Academist("Mako Kali", "05121212121", "kali@mail.com", "Docent", "CENG");
		a1.gotoClass();
		
		Workers m1 = new officer("Ali Veli", "0152346315", "ali_velii@mail.com", "IT", "09.00-17.00");
		m1.cafeteria();
		
		prelector p1 = new prelector("Rumeysa Tatar", "51221054", "rumtatar@mail.com", "MAT", "Prof", "31");
		System.out.println(p1.flNo);
		//methodlarda geçersiz kılma - overriding
		a1.enter();
		
		p1.enter();
	}

}
