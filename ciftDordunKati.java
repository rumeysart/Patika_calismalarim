import java.util.Scanner;

public class ciftDordunKati {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		float ort = 0, top = 0, i = 0;
		
		
		do {
			System.out.println("Sayi giriniz: ");
			num = input.nextInt();
			
			if(num % 4 == 0) {
				i += num;
				top++;
			}
		
		}while(num % 2 == 0);
		
		ort = i/top;
		System.out.println("Ortalama: " + ort);
		
		
		
	}

}
