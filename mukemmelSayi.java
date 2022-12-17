import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, res = 0;
		
		System.out.println("Bir sayi giriniz: ");
		num = input.nextInt();
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				res+= i;
			}
		}
		if(res == num) {
			System.out.println(num + " bir mukemmel sayidir!");
		}
		else
			System.out.println(num + " bir mukemmel sayi degildir!");
		
		input.close();
	}

}
