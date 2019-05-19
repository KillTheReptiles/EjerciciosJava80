package project;
import java.util.Scanner;
public class _55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int	longitud,apotema, lados;
		System.out.println("Ingrese el numero de lados");
		lados=scanner.nextInt();
		
		System.out.println("Ingrese la longitud");
		longitud=scanner.nextInt();
		
		System.out.println("Ingrese el apotema");
		apotema=scanner.nextInt();
		System.out.println("El área del polígono es "+(lados*longitud*apotema)/2);
	}

}
