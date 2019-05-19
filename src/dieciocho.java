//Importamos Scanner
import java.util.Scanner;
public class dieciocho {
    public static void main(String[] args){
        // Creamos input para recibir datos
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a encontrar la fuerza de un objeto. \n");
        //Solicitamos los datos
        System.out.print("Por favor ingresa la masa del objeto: ");
        double m=input.nextDouble();
        System.out.print("Por favor ingresa la aceleración de este mismo: ");
        double a=input.nextDouble();
        //Creamos la función de fuerza
        double f=m*a;
        //Imprimimos el valor
        System.out.println("El valor de la fuerza es: "+f+". Gracias por utilizar el programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson