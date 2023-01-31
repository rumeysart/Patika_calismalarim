package Patikaaa;

import java.util.Scanner;



public class patika_dersler {
	public static void main(String[] args) {
		int a;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("A sayısını giriniz: ");
		a = input.nextInt();
		System.out.println(a);
		
		
		@SuppressWarnings("resource")
		Scanner sayi = new Scanner(System.in);
		System.out.println("Bir değer girinn: ");
		double b = sayi.nextDouble();
		System.out.println(b);
		
		@SuppressWarnings("resource")
		Scanner cumle = new Scanner(System.in);
		String str = cumle.nextLine();
		System.out.println("cumle: 5" + str);
	}
}
