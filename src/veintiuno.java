//Importamos Scanner
import java.util.Scanner;
public class veintiuno {
    public static void main(String[] args){
        //Creamos input
        Scanner input = new Scanner (System.in);
        System.out.print("Hola! Vamos a convertir los segundos a horas. \n");
        //Solcitamos daots
        System.out.print("Por favor ingresa los segundos: ");
        int seg=input.nextInt();
        //Creamos la fórumla como número flotante
        float h=seg/3600;
        //Imprimimos el valor
        System.out.println("El valor de segundos a horas es de: "+h+" . Gracias por utilzar el programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson