//Importamos Scanner
import java.util.Scanner;
public class trece {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        //Declaramos las variables integras
        int A, B, AUX;
        //Solicitamos los valores
        System.out.print("Introduzca valor de A: ");
        A = input.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = input.nextInt();
        //Imprimimos los iniciales
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);
        //Instrucciones para hacer el intercambio
        //Utilizamos una variable auxiliar para hacer el cambio.
        AUX = A;
        A = B;
        B = AUX;
        //Imprimimos los finales
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson
