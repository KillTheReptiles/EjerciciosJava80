//Importamos Scanner
import java.util.Scanner;
public class veinticuatro {
    public static void main(String[] args){
        //Creamos input para Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a ver cuanta puede ser la menor cantidad de billetes que se pueden entregar. \n");
        System.out.print("Por favor ingresa la cantidad de billetes a retirar: ");
        //Hacemos procedimientos matemáticos como int para la cantidad exacta de billetes
        int moneyhoney= input.nextInt();
        int m50=moneyhoney/50000;
        int m20=moneyhoney/20000;
        int m10=moneyhoney/10000;
        int m5=moneyhoney/5000;
        int m2=moneyhoney/2000;
        int m1=moneyhoney;
        //Imprimimos la cantidad de billetes
        System.out.println("El valor de "+moneyhoney+" se puede sacar en "+m50+" billetes de 50 , "+m20+" billetes de 20 , "+m10+" billetes de 10 , "+m5+" billetes de 5, "+m2+" billetes de 2 . Gracias por utilizar el programa.");

    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson