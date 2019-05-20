import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String[] args) {
        System.out.println("Digite ¨000¨ para acabar el bucle");
        int cont1=0;
        int cont2=0;
        while (true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite un numero");
            int n = entrada.nextInt();
            if (n >= 100) {
                cont1 += 1;
            } else {
                cont2 += 1;
            }
            if (n == 000){
                System.out.println("Numeros mayores a 100:"+ cont1);
                System.out.println("Numeros menores a 100:"+cont2);
                break;
            }
        }
    }
}