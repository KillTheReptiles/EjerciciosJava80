//Importamos Scanner
import java.util.Scanner;
public class nueve {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        //Se solicita valores
        System.out.print("Hola! Vamos a aplicar el IVA a una venta realizada. \n");
        System.out.print("Por favor ingresa el valor de la venta: \n");
        double venta = input.nextInt();
        //Se imprime valor de la venta original
        System.out.println("El valor de la venta ingresado fue de: "+venta+"\n");
        //Aplicamos iva e lo imprimimos
        double iva=venta*(0.19);
        System.out.println("El IVA aplicado es de: "+iva+"\n");
        //Sumamos el IVA aplicado y se imprime
        double venta_iva=venta+iva;
        System.out.println("El valor total con IVA es de: "+venta_iva+"\n");
        System.out.print("Gracias por utilizar el programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson