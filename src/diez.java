//Importamos Scanner
import java.util.Scanner;
public class diez {
    public static void main (String[] args){
        //Creamos input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a sacar el area y perimetro de un cìrculo. \n");
        System.out.print("Por favor ingresa el radio del circulo: ");
        //Solicitamos datos
        double radio= input.nextDouble();
        //Creamos procedimiento matemático
        double area= Math.PI * (radio*radio);
        double perimeter= 2 * Math.PI * radio;
        //Imprimimos valores
        System.out.println("El área del círculo es de: "+area+"\n");
        System.out.println("El perímetro del círculo es de: "+perimeter+"\n");
        System.out.println("Gracias por utilizar el programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson