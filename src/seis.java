//Importamos Scanner
import java.util.Scanner;
public class seis {
    public static void main (String[] args){
        //Creamos input para scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a sumar ,restar , multiplicar y dividir\n");
        //Solicitamos los números
        System.out.print("Por favor ingresa el primer número: ");
        float a1 = input.nextFloat();
        System.out.print("Por favor ingresa el segundo número número: ");
        float a2= input.nextFloat();
        //Creamos los procedimientos matemáticos
        float resultado1 = a1+a2;
        float resultado2 = a1-a2;
        float resultado3= a1*a2;
        float resultado4= a1/a2;
        //Se imprime los resultados
        System.out.print("Suma: "+resultado1+"\n");
        System.out.print("Resta: "+resultado2+"\n");
        System.out.print("Multiplicación: "+resultado3+"\n");
        System.out.print("División: "+resultado4+"\n");
        System.out.print("Gracias por utilizar la aplicación.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson