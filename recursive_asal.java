package Patikaaa;
import java.util.Scanner;

public class recurive_asal {

	static boolean asalMi(int x) {
		
		if (x <= 1){
            return false;
        }
        for (int i = 2; i < (x/2); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Sayi girin: ");
		int sayi = n.nextInt();
		System.out.println();
		boolean res = asalMi(sayi);
		if(res == true)
		{
			System.out.println(sayi + " Bir Asal Sayidir!");
		}
		else
			System.out.println(sayi + " Asal Sayi Degildir!");
	}

}
