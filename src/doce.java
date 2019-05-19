//Importamos Scanner
import java.util.Scanner;
public class doce {
    public static void main(String[] args){
        //Creamos input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Este programa te permite calcular el promedio de tres números. \n");
        //Solicitamos datos
        System.out.print("Por favor ingresa el primer número: \n");
        double n1 = input.nextDouble();
        System.out.print("Por favor ingresa el segundo número: \n");
        double n2 = input.nextDouble();
        System.out.print("Por favor ingresa el tercer número: \n");
        double n3= input.nextDouble();
        //Creamos formula de promedio
        double promedio= (n1+n2+n3)/3;
        //Imprimimos
        System.out.println("El promedio de los números fue de: "+promedio+"\n");
        System.out.print("Gracias por utilizar el programa");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson
