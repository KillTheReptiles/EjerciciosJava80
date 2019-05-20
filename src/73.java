import java.util.Scanner;
public class Ejercicio73 {
    public static void main(String[] args) {
        System.out.println("\"Digite un numero en Binario para convertir a Hexadecimal Ejm;¨1100¨ = c: \"");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        if (entrada === 1000){
            System.exit();
        } else {
            int temp = int(entrada, 2);
            System.out.print(entrada+"En hexadecimal es:"+ hex(temp));
        }
    }
}