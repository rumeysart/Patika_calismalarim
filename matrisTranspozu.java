package Patikaaa;
import java.util.Scanner;
import java.util.Arrays;

public class matrisTranspozu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Satir sayisini giriniz: ");
		int a = input.nextInt();
		System.out.println("Sutun sayisini giriniz: ");
		int b = input.nextInt();
		int num = 0;
		int[][] ar = new int[a][b];
		int[][] arr = new int[b][a];
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++) {
				System.out.println(i + ". satir " + j + ". sutunun elemanini giriniz: ");
				num = input.nextInt();
				ar[i-1][j-1]= num;
				arr[j-1][i-1] = num;
			}
		}
		System.out.println("Matris: ");
		for(int i = 0; i< a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpoze: ");
		for(int j = 0; j < b; j++) {
			for(int i = 0; i < a; i++) {
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println("");		
		}
	}

}
