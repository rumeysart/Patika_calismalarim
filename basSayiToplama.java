package Patikaaa;

import java.util.Scanner;
public class basamakSayisiniToplama {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int num, don, toplam = 0;
		//ornek: 1643 = 1 + 6 + 4 + 3
		
		System.out.println("Sayi giriniz: ");
		num = input.nextInt();

		
		while(num != 0) {
			
			toplam += (num % 10);
			
			if(num / 10 != 0) 
			{
				num /= 10;
			}
		
			else
				num -= num;
		}
		System.out.println("Basamaklarin toplami: " + toplam);
		}
		
		
	}
