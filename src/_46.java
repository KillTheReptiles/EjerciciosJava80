package project;

import java.util.Scanner;
public class _46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Ingrese el primer n�mero");
		num1=scanner.nextInt();
		System.out.println("Ingrese el segundo n�mero");
		num2=scanner.nextInt();
		System.out.println("Ingrese el tercer n�mero");
		num3=scanner.nextInt();
		if(num1==num2 && num2==num3) {
			System.out.println("Los tres n�meros son iguales");
		}
		else {
			if(num1==num3) {
				System.out.println("el n�mero primer n�mero es igual al tercero");
			
		}
		 
				if(num2==num3) {
					System.out.println("el segundo n�mero es igual al tercero");
				}
			
		 
					if(num1==num2) {
						System.out.println("el n�mero primer n�mero es igual al segundo");

				}
					
						if(num1!=num2 && num2!=num3)
							System.out.println("Los tres n�meros son diferentes");
		}
		
					
		
				
		
		
			
		
		
	}
	
	
}
