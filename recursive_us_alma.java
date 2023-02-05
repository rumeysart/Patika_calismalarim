package Patikaaa;
import java.util.Scanner;

public class recursive_us_alma {
	
	 static int usHesapla(int a, int b) {
		 int res = 1;
		 if(a == 1)
			 return 1;
		 if(b == 1)
			 return a;
		 for(int i=0; i<b; i++) {
			 res *= a;
			 
		 }
		 return res;
		
	}
	

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Taban degeri girin: ");	
		int taban = n.nextInt();
		System.out.println("Us degerini girin: ");
		int us = n.nextInt();
		
		int res = usHesapla(taban, us);
		System.out.println("Sonuc: " + res);
		
	}

}
