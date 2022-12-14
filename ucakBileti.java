import java.util.Scanner;

public class ucakBileti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float km = 0;
		double nTutar = 1, yasInd = 1, indTutar = 1, biletInd = 1;
		int tip, yas = 0;
		
		
		System.out.println("KM cinsinden mesafeyi giriniz: ");
		km = input.nextFloat();
		nTutar = km * 0.10;
		
		System.out.println("Yasinizi giriniz: ");
		yas = input.nextInt();
		
		System.out.println("Yolculuk tipini giriniz: ");
		tip = input.nextInt();
		
		if((km < 0) || (yas < 0)) {
			System.out.println("Hatali Veri Girdiniz!");
		}
		else if(!(tip == 1 || tip == 2))
			System.out.println("Hatali Veri Girdiniz!");
	
		else if(yas < 12) {
			yasInd = nTutar * 0.5;
			indTutar = nTutar - yasInd;
			if(tip == 2) {
				biletInd = nTutar * 0.20;
				indTutar = (nTutar - biletInd) * 2;
				System.out.println(" Toplam tutar: " + indTutar + " TL");
			}
			System.out.println(" Toplam tutar: " + nTutar + " TL");
		}
		else if((yas > 12) && (yas < 24)) {
			yasInd = nTutar * 0.10;
			nTutar = nTutar - yasInd;
			if(tip == 2) {
				biletInd = nTutar * 0.20;
				indTutar = (nTutar - biletInd) * 2;
				System.out.println("Toplam tutar: " + indTutar + " TL");
			}
			else
				System.out.println("Toplam tutar: " + nTutar + " TL");
		}
		else if(yas > 65) {
			yasInd = nTutar * 0.10;
			nTutar = nTutar - yasInd;
		if(tip == 2) {
			biletInd = nTutar * 0.20;
			indTutar = (nTutar - biletInd) * 2;
			System.out.println("Toplam tutar: " + indTutar + " TL");
		}
		else
			System.out.println("Toplam tutar: " + nTutar + " TL");
		}
		else {
			if(tip == 2) {
				biletInd = nTutar * 0.20;
				indTutar = (nTutar - biletInd)* 2;
				System.out.println("Toplam tutar: " + indTutar + " TL");
			} 
			System.out.println("Toplam tutar: " + nTutar + " TL");
		}
	
	}
	

}
