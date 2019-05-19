//Importamos Scanner
import java.util.Scanner;
public class quince {
    public static void main(String[] args){
        //Creamos input para scanner
        Scanner input= new Scanner(System.in);
        System.out.print("Hola! Vamos a sacar la distancia que recorre un objeto en una línea recta. \n");
        //Ingresamos el tiempo de recorrido , la aceleración y la velocidad inicial
        System.out.print("Por favor ingresa el tiempo recorrido: ");
        double t= input.nextDouble();
        System.out.print("Por favor ingresa la aceleración : ");
        double a=input.nextDouble();
        System.out.print("Por favor ingresa la velocidad inicial: ");
        double vo=input.nextDouble();
        //Creamos la funcion para distancia
        double d=(vo*t)+(0.5*a*(t*t));
        //Imprimimos el resultado
        System.out.println("La distancia recorrida fue de: "+d+ " Gracias por utilizar el programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson