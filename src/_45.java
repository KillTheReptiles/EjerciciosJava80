package project;
import java.util.Scanner;
public class _45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner scanner = new Scanner(System.in);
			int num1;
			System.out.println("Ingrese un número del 1 al 7");
			num1=scanner.nextInt();
			if(num1==1) {
				System.out.println("Lunes");
			}
			if(num1==2) {
				System.out.println("Martes");
				
			}
			if(num1==3) {
				System.out.println("Miercoles");
			}
			if(num1==4) {
				System.out.println("Jueves");
			}
			if(num1==5) {
				System.out.println("Viernes");
			}
			if(num1==6) {
				System.out.println("Sabado");
			}
			if(num1==7) {
				System.out.println("Domingo");
			
			}
			if(num1<=0 || num1>7) {
				System.out.println("El número ingresado debe estar en el rango de 1 a 7");
			}
			
		
		
		}

	

	}


