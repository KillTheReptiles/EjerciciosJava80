package project;

import java.util.Scanner;

public class _48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena, cadenaInvertida;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el texto");
		cadena=scanner.nextLine();
		StringBuilder builder=new StringBuilder(cadena);
		cadenaInvertida=builder.reverse().toString();
		System.out.println("el texto original es :"+cadena +" El texto invertido es :"+cadenaInvertida);
		
	}

}
