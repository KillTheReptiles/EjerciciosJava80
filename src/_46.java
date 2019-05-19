package project;

import java.util.Scanner;
public class _46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Ingrese el primer número");
		num1=scanner.nextInt();
		System.out.println("Ingrese el segundo número");
		num2=scanner.nextInt();
		System.out.println("Ingrese el tercer número");
		num3=scanner.nextInt();
		if(num1==num2 && num2==num3) {
			System.out.println("Los tres números son iguales");
		}
		else {
			if(num1==num3) {
				System.out.println("el número primer número es igual al tercero");
			
		}
		 
				if(num2==num3) {
					System.out.println("el segundo número es igual al tercero");
				}
			
		 
					if(num1==num2) {
						System.out.println("el número primer número es igual al segundo");

				}
					
						if(num1!=num2 && num2!=num3)
							System.out.println("Los tres números son diferentes");
		}
		
					
		
				
		
		
			
		
		
	}
	
	
}
