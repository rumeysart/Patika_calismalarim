
import java.util.Scanner;
public class fibonacci{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, a = 0, b = 1;
		
		System.out.println("Kac adim istediginizi girin: ");
		num = input.nextInt();
		
		
		for(int i = 0; i<num/2; i++) {
			
			System.out.print(a + " ");
			a += b;
			System.out.print(b + " ");
			b += a;
			
		}
		if(num % 2 != 0) {
			System.out.print(a + " ");
		}
		input.close();
		
		
	}

}
