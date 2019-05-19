//Importamos Scanner y Math para recibir y hacer procedimientos matemáticos
import java.util.Scanner;
import java.lang.Math;
public class diecinueve {
    public static void main(String[] args){
        //Creamos input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a sacar la distancia entre dos coordenadas. \n");
        //Solicitamos las coordenadas
        System.out.print("Por favor ingresa x1: ");
        float x1=input.nextFloat();
        System.out.print("Por favor ingresa y1: ");
        float y1=input.nextFloat();
        System.out.print("Por favor ingresa x2: ");
        float x2=input.nextFloat();
        System.out.print("Por favor ingresa y2: ");
        float y2=input.nextFloat();
        //Creamos la formula de distancia
        double d=Math.sqrt(((x2-x1)*(x2-x1)+((y2-y1)*(y2-y1))));
        //Imprimimos el resultado
        System.out.print("La distancia entre las dos es: "+d+". Gracias por utilizar el programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson.