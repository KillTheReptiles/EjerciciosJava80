package project;

import java.util.Scanner;

public class _65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,acum,num,x,acum_par,cont_par,acum_impar,cont_impar;
		
		acum=0;
		acum_par=0;
		cont_par=0;
		acum_impar=0;
		cont_impar=0;		
				
				
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce la cantidad de números");
		x=scanner.nextInt();
		for (int i=0;i<=x;i++) {
		System.out.println("Introduce el número");	
		n=scanner.nextInt();
		if(n%2==0) {
			acum_par=acum_par+n;
			cont_par=cont_par+1;
					
			
		}
		else {
			acum_impar=acum_impar+n;
			cont_impar=cont_impar+1;
			
		}
		
				
		
		}
		if(cont_par==0) {
			System.out.println("El promedio de pares es 0");
		}
		else {
			System.out.println("El promedio de pares es :"+acum_par/cont_par);
		}
		
		if(cont_impar==0) {
			System.out.println("El promedio de impares es 0");
		}
		else {
			System.out.println("El promedio de impares es :"+acum_impar/cont_impar);
		}
		
		
	}

}
