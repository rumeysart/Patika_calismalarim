package Patikaaa;

import java.util.Arrays;

public class dizidekiElemanlarinFrekansi {
	
	 public static void main(String[] args) {
	        int[] dizi = {40, 40, 50 ,11, 1,  50, 40, 20, 40, 1};
	        int[] tekrar = new int[dizi.length];
	        tekrar = dizi;
	        int frekans = 0;

	        System.out.println("Dizi : " + Arrays.toString(dizi));
	        System.out.println();
	        for (int i = 0; i < dizi.length; i++) {
	            for (int j = 0; j < dizi.length; j++) {
	                if (dizi[i] == dizi[j] && dizi[i] > -1) {
	                    frekans = frekans + 1;
	                    if(j>i){
	                        dizi[j]=-1;
	                    }
	                    
	                }

	            }
	            if(dizi[i]>-1){
	            System.out.println(dizi[i] + " sayisi " + frekans + " kere tekrar edildi.");
	            }
	            frekans = 0;
	        }
	 }
}