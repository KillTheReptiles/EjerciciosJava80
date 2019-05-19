//Importamos Scanner
import java.util.Scanner;
public class veinticinco {
    public static void main(String[] args){
        //Creamos input para scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a invertir el orden los números de un número de 4 dígitos. \n");
        System.out.print("Por favor ingresa el número a ingresar: ");
        //Solicitamos el número de cuatro dígitos
        int a= input.nextInt();
        //Sacamos el primer valor
        int b=(int)(a/1000);
        //Sacamos el residuo a otro valor
        float c=a-(b*1000);
        //Seguimos con este procedimiento sucesivamente
        int d=(int)(c/100);
        float e=c-(d*100);
        int f=(int)(e/10);
        int g=(int)(e-(f*10));
        //Imprimimos el resultado
        System.out.println("El valor intercalado de "+a+" es: "+g+f+d+b);
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson