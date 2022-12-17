
import java.util.Scanner;

public class tersUcgen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int stars;
		
		System.out.println("Basamak sayisi girin: ");
		stars = input.nextInt();
		
		for(int i = stars; i>=1; i--) 
		{
			for(int k =0; k<(stars - i); k++)
			{
				System.out.print(" ");
			}
			
			for(int j = 2*i-1; j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		
		}
		
	}

}
