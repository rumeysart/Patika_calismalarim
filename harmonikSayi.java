import java.util.Scanner;


public class harmonikSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float n, res = 0;
		
		System.out.println("Sinir sayisini giriniz: ");
		n = input.nextInt();
		
		for(float i = 0; i<=n; i++) {
			res += (1/n);
			n--;
		}
		System.out.println("Sonuc: " + res);	
	}

}
