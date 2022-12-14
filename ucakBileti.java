import java.util.Scanner;
/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

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
