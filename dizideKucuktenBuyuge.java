import java.util.Scanner;
import java.util.Arrays;

public class dizideKucuktenBuyuge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int s, k = 1;
	
		System.out.println("Dizinin Boyutu: ");
		s = input.nextInt();
		
		int[] a = new int[s];
		System.out.println("Dizinin elemanlarini girin: ");
		
		for(int i = 0; i < a.length; i++) {
		System.out.println(k + ". Elemani: " );
		a[i] = input.nextInt();
		k++;
		}
		Arrays.sort(a);
		System.out.println("Siralama: " + Arrays.toString(a));
		
	}

}
