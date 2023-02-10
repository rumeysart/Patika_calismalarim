package Patikaaa;
import java.util.Scanner;


public class palindromikKelimeler {
	
	static boolean palindromMu(String str) {
		String tersStr = "";
		for(int i = str.length()-1; i>=0; i--) {
			tersStr += str.charAt(i);
		}
		return str.equals(tersStr);
		
	}

	public static void main(String[] args) {
	
		System.out.println(palindromMu("kayak"));
		
	}

}
