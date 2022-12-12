import java.util.Scanner;


public class daireAlanCevre {

	public static void main(String[] args) {
		// yarıcapı kullanıcıdan alınır
		// alan formulu pi*r*r;
		/*
		 cevre formulu 2*pi*r
		 yarıcapı r, merkez acisinin olcusu alpha olan daire diliminin 
		 alanını bulan programı yazın
		 pi sayisini 3.14 alın
		 formul= (pi*(r*r)*alpha)/360
		 */
		
		double cevre;
		double pi, r, alpha, alan, alan2;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yaricapini girin: ");
		r = input.nextDouble();
		
		pi = 3.14;
		
		cevre = 2 * pi * r;
		alan = pi * r * r;
		
		System.out.println("Merkez olcusunu girin: ");
		alpha = input.nextDouble();
		
		alan2 = (alan*alpha)/360;
		
		System.out.println("Dairenin cevresi: " + cevre);
		System.out.println("Dairenin alani: " + alan2);
		
	}

}
