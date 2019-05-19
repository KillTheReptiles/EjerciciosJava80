//Importamos scanner
import java.util.Scanner;
public class veintidos {
    public static void main(String[] args){
        //Creamos input
        Scanner input = new Scanner (System.in);
        System.out.print("Hola! Vamos a convertir los segundos a minutos. \n");
        //Solcitamos daots
        System.out.print("Por favor ingresa los segundos: ");
        int seg=input.nextInt();
        //Creamos la fórumla como número flotante
        float min=seg/60;
        //Imprimimos el valor
        System.out.println("El valor de segundos a miutos es de: "+min+" . Gracias por utilzar el programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson