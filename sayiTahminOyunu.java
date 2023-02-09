package Patikaaa;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class sayiTahminOyunu {

	public static void main(String[] args) {

		Random rand = new Random();
		int number = rand.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		
		int sayim = 0;
		boolean isWin = false;
		boolean isMistake = false;
		int[] wrong = new int[5];
		
		int tahmin;
		System.out.println(number);
		while(sayim<5) {
			System.out.println("Lutfen tahmininizi giriniz:");
			tahmin = input.nextInt();
			
			if(tahmin < 0 || tahmin > 99) {
				System.out.println("Lütfen 0-100 arasinda bir deger giriniz!");
				if(!isMistake) {
					isMistake = true;
					System.out.println("Bir daha hatali girisinizde hakkinizdan dusulecektir");
				}
				else {
					System.out.println("Cok fazla hatali giris yaptiniz Kalan hakkiniz: " + (5 - ++sayim));
				}
				continue;
			}
			if(tahmin == number) {
				System.out.println("TEBRİKLER! Doğru tahmin ettiniz! " + number + " doğru sayi");
				isWin = true;
				break;
			}
			else {
			if(tahmin < number) {
				System.out.println(tahmin + " sayisi yanlistir");
				
				System.out.println("Daha buyuk bir sayi tahmin etmelisiniz!");
			}
			else if(tahmin > number) {
				System.out.println(tahmin + " sayisi yanlistir");
				
				System.out.println("Daha kucuk bir sayi taahmin etmelisiniz!");
			}	
			wrong[sayim++] = tahmin;
		System.out.println("Kalan hakkiniz: " + (5 - sayim));
			}
	}
			if(!isWin) {
				System.out.println("Kaybettiniz!");
				if(!isMistake) {
				System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
				}
			}
			
			
		}
		
	}

