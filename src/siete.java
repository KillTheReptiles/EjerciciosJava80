//Importamos Scanner
import java.util.Scanner;
public class siete {
    public static void main (String[] args){
        //Creamos input para Scanner
        Scanner input = new Scanner(System.in);
        //Solicitamos valores
        System.out.print("Hola! Vamos a imprimir un número en entero y decimal aparte.\n");
        System.out.print("Por favor ingresa el valor (Poner punto decimal como , ): ");
        //Creamos procedimientos matemáticos
        float a1 = input.nextFloat();
        int entero=(int)a1;
        System.out.print("El número entero sería: "+entero+"\n");
        //Imprimimos valores
        float decimal=a1-entero;
        System.out.print("Los números decimales son: "+decimal+"\n");
        System.out.print("Gracias por utilizar este programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson