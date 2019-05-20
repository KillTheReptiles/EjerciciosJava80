import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero decimal");
        int n = entrada.nextInt();
        int bin == " ";
        if (entrada > 0){
            while (entrada > 0){
                if (entrada%2 == 0){
                    bin = "0" + bin;
                } else {
                    bin = "1" + bin;
                }
                Scanner entrada = new Scanner(System.in);
                int n = entrada.nextInt((math.floor(DecimalFormat/2)));
            }
        }
        else{
            if (DecimalFormat == 0){
                bin = "0";
            } else {
                System.out.println("Error")
            }
        }
        System.out.print("El decimal a binario es"+ bin)
    }
}