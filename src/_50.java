package project;
import java.util.Scanner;

public class _50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase ;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el texto  :");
		frase=scanner.nextLine();
		
		
		
		
		char[] cfr = frase.toCharArray();
		
		
		for(int i = 0; i<cfr.length; i++) {
				

	           if(cfr[i] == ' ' || cfr[i] == '.' || cfr[i] == ','){
	        	   

	           cfr[i+1] = Character.toUpperCase(cfr[i+1]);

	           }

	           System.out.print(cfr[i]);

	       }

	    }

	}