package project;
import java.util.Scanner;
public class _53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String uno, dos,a;
		System.out.println("Introduce el texto");
		uno=scanner.nextLine();
		System.out.println("Introduce el segundo texto");
		dos=scanner.nextLine();
		if(uno.contentEquals(dos)) {
			System.out.println("Las cadenas son iguales");
		}
		else {
			System.out.println("Las cadenas son diferentes");
		}
		
}
}
