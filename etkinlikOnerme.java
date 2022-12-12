package Patikaaa;

import java.util.Scanner;

public class etkinlikOnerme {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//hava sicakligina gore etkinlik onerme
		
		int t;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sicaklik girin: ");
		t = input.nextInt();
		
		if(t < 5)
		{
			System.out.println("Kayak yapabilirsiniz");
		}
		else if(t <= 25) // zaten 5ten buyukler gireceği için t >= 5 yazmaya gerek yok
		{
			if(t <= 15)
				System.out.println("Sinemaya gidebilirsiniz");	
			if(t >= 10)
				System.out.println("Piknik yapabilirsiniz.");
		}
		else 
			System.out.println("Yuzmeye gidebilirsiniz.");
	}

}
