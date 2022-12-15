import java.util.Scanner;


/*
 Sıfırdan başlayıp girilen sayıya kadar olan sayıları bulup 
 ortalamasını yazan program
 */
public class girilenSayiyaKadar3ve4eBolunenOrtalama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float edge, div = 0, toplam = 0;
		
		System.out.println("Bir sinir sayi giriniz: ");
		edge = input.nextInt();
		
		for(int i = 0; i < edge; i++) {
			if(i % 12 == 0)
			{
				div += i;
				toplam++;
			}
		
		}
		float ort = div / toplam;
		System.out.println("Ortalama: " + ort);
		
	}

}
