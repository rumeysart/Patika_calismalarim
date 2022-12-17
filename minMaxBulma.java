import java.util.Scanner;

public class minMaxBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, min = 0, max=0, n;
		
		System.out.println("Kac adet sayi gireceksiniz: ");
		m = input.nextInt();
		
		for(int i =1; i<=m; i++) {
			System.out.println(i + ". sayiyi giriniz: ");
			n = input.nextInt();
			
			if(i == 1)
			{
				min = n;
				max = n;
			}
			if(min > n)
			{
				min = n;
			}
			if(max < n)
			{
				max = n;
			}

		}
		System.out.println("maksimum deger: " + max);
		System.out.println("minimum deger: " + min);
	}
		
}


