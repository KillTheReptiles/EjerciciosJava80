//Importamos Scanner
import java.util.Scanner;
public class once {
    public static void main (String[] args){
        //Creamos input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Este programa te permite calcular el área de un hexágono. \n");
        //Solicitamos datos
        System.out.print("Por favor ingresa el tamaño del lado: ");
        double lado= input.nextDouble();
        System.out.print("Por favor ingresa el apotema: ");
        double ap= input.nextDouble();
        //Creamos las formulas para area y perimetro
        double perimetro = 6*lado;
        double area=(perimetro*ap)/2;
        //Las imprimimos
        System.out.print("El área del hexágono es de: "+area+"\n");
        System.out.print("Gracias por utilizar el programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson