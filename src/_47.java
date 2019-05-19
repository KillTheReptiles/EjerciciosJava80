package project;

import java.util.Scanner;

public class _47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double x1,y1,x2,y2,radio,distancia;
		
		System.out.println("Introduce la cordenada x1");
		x1=scanner.nextInt();
		System.out.println("Introduce la cordenada y1");
		y1=scanner.nextInt();
		System.out.println("Introduce la cordenada x2");
		x2=scanner.nextInt();
		System.out.println("Introduce la cordenada y2");
		y2=scanner.nextInt();
		radio=6371;
		distancia=radio*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		System.out.println("la distancia es "+distancia);
		
	}
	

}
