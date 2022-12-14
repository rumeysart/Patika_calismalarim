
import java.util.Scanner;

public class artikYilHesabi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		
		System.out.println("Yil Giriniz: ");
		a = input.nextInt();
		
		if(a%400 == 0) {
			System.out.println(a + " bir artik yildir!");
		}
		else if(a % 100 == 0) {
			System.out.println(a + " bir artik yil degildir! ");
		}
		else if(a % 4 == 0) {
			System.out.println(a + " bir artik yildir! ");
		}
		else
			System.out.println( a + " bir artik yil degildir!");


	}

}
