package project;

import java.util.Scanner;

public class _64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,acum,num,x;
		
		acum=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce la cantidad de n�meros");
		x=scanner.nextInt();
		for (int i=0;i<=x;i++) {
		System.out.println("Introduce el n�mero");	
		n=scanner.nextInt();
		acum=acum+n;
				
		
		}
		 
		System.out.println("El promedio es :"+acum/x);
		
	}

}
