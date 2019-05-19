//Importamos Scanner
import java.util.Scanner;
public class catorce {
    public static void main(String[] args){
        //Creamos input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola ! Vamos a calcular el tiempo de caída. \n");
        //Solicitamos la altura
        System.out.print("Por favor ingrese la altura: ");
        double altura= input.nextDouble();
        //Creamos el procedimiento matemático
        double tiempo=(2*altura)/9.81;
        //Se imprime los resultados
        System.out.println("El tiempo de caída es de: "+tiempo+" sec");
        System.out.print("Gracias por utilizar el programa.");

    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson
