//Importamos Scanner
import java.util.Scanner;
public class veinte {
    public static void main(String[] args){
        //Creamos input
        Scanner input=new Scanner(System.in);
        System.out.print("Hola! Valos a volver tu número un nn y nnn. \n");
        //Solcitamos n
        System.out.print("Por favor ingresa el número n : ");
        int n=input.nextInt();
        int nn=n*11;
        int nnn=n*111;
        //Imprimimos n , nn , nnn
        System.out.print("El número "+n+" es nn:"+nn+" nnn: "+nnn+" . Gracias por utilizar el programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson