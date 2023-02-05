package Patikaaa;
import java.util.Scanner;

public class desene_gore_metot {
	
	static int sayi(int a, int b) {
		
		if(a>0) {
			System.out.print(a + " ");
			a -= 5;
			return sayi(a,b);
		}
		return sayi1(a,b);
	}
	
	static int sayi1(int a, int b) {
		
		if(a<=b) {
			System.out.print(a + " ");
			a += 5;
			return sayi1(a,b);
		}

			return b;
		
	}
	
	

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("N Sayisi: ");
		int s = n.nextInt();
		int c;
		c = s;
		sayi(c,s);
	}

}
