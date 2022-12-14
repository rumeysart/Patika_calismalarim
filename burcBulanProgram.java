import java.util.Scanner;


public class burcBulanProgram {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int month, day;
	
	System.out.println("Dogdugunuz gunu girin: ");
	day = input.nextInt();
	
	System.out.println("Dogdugunuz ayi sayi biciminde girin: ");
	month = input.nextInt();
	
	if(((month < 0) && (month > 12)) || ((day < 0) && (day > 31))) {
		System.out.println("Yanlis deger girdiniz ");
	}
	
	else if(month == 1) {
		if((day > 0) && (day < 22)) {
			System.out.println("Oglak Burcusunuz");
		}
		else
		{
			System.out.println("Kova Burcusunuz");
		}
	}
	else if(month == 2) {
		if((day > 0) && (day < 20)){
			System.out.println("Kova Burcusunuz");
		}
		else {
			System.out.println("Balik Burcusunuz");
		}
	}
	else if(month == 3) {
		if((day > 0) && (day <21)) {
			System.out.println("Balik Burcusunuz");
		}
		else {
			System.out.println("Koc Burcusunuz");
		}
	}
	else if(month == 4) {
		if((day > 0) && (day < 21)) {
			System.out.println("Koc Burcusunuz");
		}
		else {
			System.out.println("Boga Burcusunuz");
		}
	}
	else if(month == 5) {
		if((day > 0) && (day>22)) {
			System.out.println("Boga Burcusunuz");
		}
		else {
			System.out.println("Ikizler Burcusunuz");
		}
	}
	else if(month == 6) {
		if((day > 0) && (day <23)) {
			System.out.println("Ikizler Burcusunuz");
		}
		else {
			System.out.println("Yengec Burcusunuz");
		}
	}
	else if(month == 7) {
		if((day > 0)&& (day <23)) {
			System.out.println("Yengec Burcusunuz");
		}
		else {
			System.out.println("Aslan Burcusunuz");
		}
	}
	else if(month == 8) {
		if((day> 0)&& (day <23)) {
			System.out.println("Aslan Burcusunuz");
		}
		else
			System.out.println("Basak Burcusunuz");
	}
	else if(month == 9) {
		if((day > 0) && day > 23) {
			System.out.println("Basak Burcusunuz");
		}
		else 
			System.out.println("Terazi Burcusunuz");
	}
	else if(month == 10) {
		if((day > 0)&& (day < 23))
			System.out.println("Terazi Burcusunuz");
		else
			System.out.println("Akrep Burcusunuz");
	}
	else if(month == 11) {
		if((day > 0) && (day > 22)) {
			System.out.println("Akrep Burcusunuz");
		}
		else
			System.out.println("Yay Burcusunuz");
	}
	else {
		if((day> 0)&& (day < 22))
			System.out.println("Yay Burcusunuz");
		else
			System.out.println("Oglak Burcusunuz");
	}
	}
}
