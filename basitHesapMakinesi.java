package Patikaaa;
import java.util.Scanner;

public class basitHesapMakinesi {

	public static void main(String[] args) {

		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ilk sayiyi giriniz: ");
		n1 = input.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz: ");
		n2 = input.nextInt();
		
		System.out.print(" 1)Toplama \n 2)Cikarma \n 3)Carpma \n 4)Bolme \n");
		System.out.print("Seciminiz: ");
		select = input.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Toplam: " + (n1 + n2));
		    break;
		case 2:
			System.out.println("Fark: " + (n1 - n2));
		    break;	
		case 3:
			System.out.println("Carpim: " + (n1 * n2));
		    break;
		case 4:
			System.out.println("Bolumu: " + (n1 / n2));
		    break;
		default:
				System.out.print("Yanlis tusa bastiniz, tekrar deneyiniz");
		}	
	}

}
