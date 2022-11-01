package Patikaaa;
/*
 * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV
 * tutarını hesaplayıp ekrana bastıran programı yazın
 * 
 * (NOT: kdv tutarını %18 olarak alın)
 * KDV'siz fiyat== 10;
 * kdv'li fiyat == 11.8;
 * kdv tutarı == 1.8;
 */
import java.util.Scanner;

public class kdvTutariHesaplama {

	public static void main(String[] args) {
		double tutar, kdvOran = 0.18 ;
		Scanner ucret = new Scanner(System.in);
		System.out.println("Ücret tutarını girin: ");
		tutar = ucret.nextDouble();
		double kdvTutar = tutar * kdvOran;

		double kdvliTutar = tutar + kdvTutar;
		System.out.println("KDV'siz Tutar: " + tutar);
		System.out.println("KDV Oranı: " + kdvOran);
		System.out.println("KDV Tutarı: " + kdvTutar);
		System.out.println("KDV'li Tutar: " + kdvliTutar);
		

	}

}
