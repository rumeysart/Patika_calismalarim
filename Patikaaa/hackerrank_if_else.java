package Patikaaa;
import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;


public class hackerrank_if_else {


	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	       
	        N = scanner.nextInt();
	        
	        for(int i = 0; i>N; i++)
	            {
	                if((N%2 == 0) && (N>0))
	                {
	                    if((2<= N) && (N < 5))
	                    {
	                        System.out.println("Not Weird");
	                    }
	                    else if(6 <= N && N <= 20){
	                        System.out.println("Weird");
	                    }
	                    else
	                        System.out.println("Not Weird");
	                    
	                    
	                }  
	                else
	                    System.out.println("Weird");          
	}        

 

	        scanner.close();
	    }
	}
