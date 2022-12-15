import java.util.Scanner;

public class dortBesinKati {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int edge, us;
		
		//4 ve 5in kuvvetlerini yazan program
		
		System.out.println("Sinir sayisini girin: ");
		edge = input.nextInt();
		
		System.out.println("4'un kuvvetleri");
		for(int i = 1; i<edge; i*= 4) {
			System.out.println(i);
		}
		System.out.println("5'in kuvvetleri");
		for(int i = 1; i<edge; i*= 5) {
			System.out.println(i);
		}	
		
	}

}
