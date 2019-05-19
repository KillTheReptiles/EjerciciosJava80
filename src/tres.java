//Importamos Scanner
import java.util.Scanner;
public class tres {
    public static void main (String[] args){
        //Creamos el input para poder recibir el valor en strings
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a elevar un número al cuadrado. \n");
        System.out.print("Por favor ingresa el número a elevar: ");
        //Una variable integra recibirá un valor
        int numero= input.nextInt();
        //Se crea el procedimiento matemático
        int resultado=numero*numero;
        //Imprimimos el resultado
        System.out.println("El número elevado da como resultado: "+resultado+"\n");
        System.out.print("Muchas gracias por utilizar el programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson
