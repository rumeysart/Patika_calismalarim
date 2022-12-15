import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
		int n, r, comb = 1;
		
		Scanner input = new Scanner(System.in);

		
		 int k=1, s=1,m=1,b;
	        System.out.println("C(n,r) olacak şekilde lütfen n,r sayılarını giriniz:");
	        System.out.print("n: ");
			n = input.nextInt();
	        System.out.print("r: ");
	        r=input.nextInt();
	        b=n-r;
	        for (int i=1;i<=n;i++){
	            k*=i;
	        }
	        
	        for (int j=1;j<=r;j++){
	            s*=j;
	        }

	        for (int y=1;y<=b;y++){
	            m*=y;
	        }

	        
	        comb = k/(s*m);
	        
	        System.out.println("C(n,r): "+comb);
	        
	}

}
