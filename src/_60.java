package project;
import java.util.Scanner;
public class _60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner (System.in);
		System.out.println("Escribe el número");
		int num=n.nextInt();
		
		for(int i=1; i<=num;i++) {
			if(i%2==0) {
				System.out.println(i*-1);
				
			}else {
				System.out.println(i);
			}
			
			
		}
		
	}

}
