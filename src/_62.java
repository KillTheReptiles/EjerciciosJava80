package project;

import java.util.Scanner;

public class _62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Escribe el primero n�mero");
		int acum;
		acum=0;
		int n=scanner.nextInt();
		System.out.println("Escribe el segundo n�mero, este debe ser mayor al primero");
		int m=scanner.nextInt();
		for(int i=n;i<=m;i++) {
			if (m>n) {
			
				
			acum=acum+i;
			}
			
		else {
			System.out.println("El n�mero 2 debe ser mayor");
			
		}
			
	}
		System.out.println("La suma es "+acum);	
	}

}
