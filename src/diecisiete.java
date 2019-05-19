//Importamos Scanner para recibir datos
import java.util.Scanner;
public class diecisiete {
    public static void main (String[] args){
        //Creo la funcion input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a calcular la energia de un objeto. \n");
        System.out.print("Por favor ingresa la masa del objeto en KG: ");
        //Solicito los datos
        double m=input.nextDouble();
        //Declaro la velocidad de la luz y la fórmula de energia
        double v_luz=299792458;
        double e=(m*(v_luz*v_luz)/2);
        //Imprimo el resultado
        System.out.println("La energía que contiene este objeto es de: "+e+". Gracias por utilizar este programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson