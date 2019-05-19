//Importamos Scanner
import java.util.Scanner;
public class ocho {
    public static void main (String[] args){
        //Creamos input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a sacar la nota final de acuerdo a unos parámetros establecidos. \n");
        //Solicitamos notas
        System.out.print("Por favor ingresa la primera nota: \n");
        float n1= input.nextFloat();
        System.out.print("Ingresa la segunda nota: \n");
        float n2 = input.nextFloat();
        System.out.print("Ingresa la tercera nota: \n");
        float n3 = input.nextFloat();
        System.out.print("Ingresa la cuarta nota: \n");
        float n4= input.nextFloat();
        System.out.print("Ingresa la quinta nota: \n");
        float n5= input.nextFloat();
        //Creamos los porcentaje
        double nota1=n1*(0.15);
        double nota2=n2*(0.2);
        double nota3=n3*(0.15);
        double nota4=n4*(0.3);
        double nota5=n5*(0.2);
        //Variable de la nota final
        double notafinal=nota1+nota2+nota3+nota4+nota5;
        //La imprimimos
        System.out.println("La nota final es de: "+notafinal+"\n");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson