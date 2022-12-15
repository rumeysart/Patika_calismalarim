package Patikaaa;
import java.util.Scanner;

public class SinifGecmeDurumu {
	
	/*
	 Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

	Geçme Notu : 55

	Ödev
	Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
	 */

	public static void main(String[] args) {
		int Mat, Turk, Muzik, Fiz, Kimya, ort, toplam = 0, ders = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notunuz: ");
		Mat = input.nextInt();
		if(Mat >= 0 && Mat <=100) {
			toplam+= Mat;
			ders++;
		}
		
		System.out.println("Turkce Notunuz: ");
		Turk = input.nextInt();
		if(Turk >= 0 && Turk <= 100) {
			toplam+= Turk;
			ders++;
		}
		
		System.out.println("Muzik Notunuz: ");
		Muzik = input.nextInt();
		if(Muzik >= 0 && Muzik <=100) {
			toplam+= Muzik;
			ders++;
		}
		
		
		System.out.println("Fizik Notunuz: ");
		Fiz = input.nextInt();
		if(Fiz >= 0 && Fiz <= 100)
		{
			toplam+= Fiz;
			ders++;
		}
		
		System.out.println("Kimya Notunuz: ");
		Kimya = input.nextInt();
		if(Kimya >= 0 && Kimya <= 100)
		{
			toplam+= Kimya;
			ders++;
		}
		
		ort = toplam / ders;
		System.out.println("Ortalamaniz" + ort);
		if(ort < 55)
		{
			System.out.println("Maalesef Sinifta Kaldiniz :( daha cok calismalisiniz");
		}
		else {
			System.out.println("TEBRIKLER! Sinifi gectiniz!!");
		}

	}

}
