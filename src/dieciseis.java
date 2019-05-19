//Nos toca importar Scanner para los datos y Math para la raíz cuadrada
import java.util.Scanner;
import java.lang.Math;
public class dieciseis {
    public static void main(String[] args){
        //Creamos input
        Scanner input= new Scanner(System.in);
        System.out.print("Hola! Vamos a sacar la velocidad final de un objeto \n ");
        //Solicitamos los datos a utilizar
        System.out.print("Por favor ingresa la velocidad inicial: ");
        double vo=input.nextDouble();
        System.out.print("Por favor ingresa la aceleración aplicada: ");
        double a=input.nextDouble();
        System.out.print("Por favor ingresa la distancia recorrida: ");
        double d=input.nextDouble();
        //Creo la formula de velocidad inicial con sqrt()
        double vf=Math.sqrt((vo*vo)+(2*a*d));
        // Imprimimos el resultado
        System.out.println("La velocidad final del objeto es: "+vf+" . Gracias por utilizar el programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson