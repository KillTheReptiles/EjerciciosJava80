package project;
import java.util.Scanner;
public class _61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Escribe el primero n�mero");
		int n=scanner.nextInt();
		System.out.println("Escribe el segundo n�mero");
		int m=scanner.nextInt();
		for(int i=n;i<=m;i++) {
			if (m>n) {
			
				System.out.println(i);
			}
			
		else {
			System.out.println("El n�mero 2 debe ser mayor");
		}
			
		}
	}
		}
		
	


