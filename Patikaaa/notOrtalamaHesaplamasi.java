/*
 *Java ile matematik, fizik, kimya, türkçe, tarih,
 * müzik derslerinin sınav puanlarını kullanıcıdan 
 * alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın
 */
package Patikaaa;
import java.util.Scanner;



public class notOrtalamaHesaplamasi {

	public static void main(String[] args) {
		// Değişkenleri oluştur
		int mat, fk, kim,tk, tarih, muzik;
	
		//Scanner sınıfını tanımladık
	@SuppressWarnings("resource")
	Scanner ders = new Scanner(System.in);
	
		//Kullanıcıdan değerleri al
	System.out.print("Matematik Notunuz: ");
	mat = ders.nextInt();
	
	System.out.println("Fizik Notunuz: ");
	fk = ders.nextInt();
	
	System.out.print("Kimya Notunuz: ");
		kim = ders.nextInt();
		
	System.out.println("Türkçe Notunuz: ");
	tk = ders.nextInt();
	
	System.out.println("Tarih Notunuz:");
	tarih = ders.nextInt();
	
	System.out.print("Müzik Notunuz: ");
	muzik = ders.nextInt();
	
	int toplam = (mat + fk + kim + tk + tarih + muzik);
	double sonuc = toplam / 6.0;
	
	System.out.println("Ortalamanız: " + sonuc);
	
	
	boolean gecti = (sonuc>= 50);
	@SuppressWarnings("unused")
	boolean kaldi = (sonuc<50);
	String gectimi = (gecti)? "Sınıfı gecti" : "Sınıfta kaldı";
	System.out.print(gectimi);
	}

}
