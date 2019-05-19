package project;
import java.util.Scanner;


public class _63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,acum;
		acum=0;
		
		Scanner scanner=new Scanner(System.in);
		for (int i=0;i<=10;i++) {
		System.out.println("Introduce el número");	
		n=scanner.nextInt();
		acum=acum+n;
				
		
		}
		 
		System.out.println("El promedio es :"+acum/10);
		
	}

}
