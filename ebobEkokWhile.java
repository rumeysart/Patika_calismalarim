package Patikaaa;
import java.util.Scanner;

public class ebobEkokWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m, ebob = 1, ekok = 1;
		
		System.out.println("Birinci sayiyi giriniz: ");
		n = input.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz: ");
		m = input.nextInt();
		int i = 1;
		
		while(i<n || i<m) 
		{
			if((n%i == 0) &&(m % i == 0))
			{
				ebob = i;
			}
				i++;
				
			}
	
		ekok = (n*m)/ ebob;
		System.out.println("Ebob degeri: " + ebob);
		System.out.println("Ekok degeri: " + ekok);
		
		}
		
		
		
		
	}

