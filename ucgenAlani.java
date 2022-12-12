import java.util.Scanner;

public class ucgenAlani {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float u, a, b, c;
		double alan;
		
		System.out.println("uc kenari giriniz: ");
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		u = (a+b+c)/2;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Ucgenin alani: " + alan);
	
	}

}
