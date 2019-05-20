import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Ejercicio69 {
    public static void main(String[] args) {
        List  xd = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero entero");
        int n = entrada.nextInt();
        for (int i=1; i < 1000000; i ++){
            if (n % i == 0){
                xd.add(i);
                System.out.println(xd);
            }
        }
    }
}