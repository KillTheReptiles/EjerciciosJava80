//Importamos Scanner
import java.util.Scanner;
public class cuatro {
    public static void main (String[] args){
        //Creamos el input para poder recibir el valor en strings
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a sumar dos números. \n");
        System.out.print("Por favor ingresa el primer número: ");
        //Una variable integra recibirá un valor
        int numero1= input.nextInt();
        System.out.print("Por favor ingresa el segundo número: ");
        //Se recibe el segundo valor
        int numero2 = input.nextInt();
        //Se crea el procedimiento matemático
        int resultado=numero1+numero2;
        //Imprimimos el resultado
        System.out.println("La sumatoria de los números da como resultado: "+resultado+"\n");
        System.out.print("Muchas gracias por utilizar el programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson