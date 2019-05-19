package project;

import java.util.Scanner;

public class _51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String frase ;
int cont,cont2;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el texto en minusculas :");
		frase=scanner.nextLine();
		cont=0;
		char[] cfr = frase.toCharArray();
		for(int i = 0; i<cfr.length; i++) {
			if(cfr[i] == ' ' || cfr[i] == '.' || cfr[i] == ',') {
				cont=cont+1;
				frase.
		if(cont)		
			System.out.println(cont);	
				
			}
		}
	}

}
