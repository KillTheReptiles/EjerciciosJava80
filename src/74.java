import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.util.Scanner;
public class Ejercicio74 {
    public static void main(String[] args) {
        System.out.print("\"Digite un numero en Binario para convertir a Hexadecimal Ejm;¨1100¨ = c: \"");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        if (entrada === 1000){
            System.exit();
        } else {
            int temp == int(HexBinaryAdapter,2);
            System.out.print(temp+"En hexadecimal = ", HexBinaryAdapter ((temp)));
        }
    }
}