
import java.util.Scanner;

public class usluHesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, pow= 1, b;
		System.out.println("Hangi sayinin ussunu ogrenmek istiyorsaniz girin: ");
		a = input.nextInt();
		
		System.out.println("Ussu giriniz: ");
		b = input.nextInt();
		
		for(int i = 0; i<b; i++)
		{
			pow*=a;
		}
		System.out.println("Sonuc: " + pow);
		
	}

}
