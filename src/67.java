import java.util.Scanner;
public class scratch {
    public static void main(String[] args) {
        System.out.println("Digite ¨000¨ para acabar el bucle");
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        while (true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite un numero");
            int n = entrada.nextInt();
            if (n>0) {
                cont1 += 1;
                if (n%2==0){
                    cont3 += 1;
                } else {
                    cont4 += 1;
                }
                if (n%8==0){
                    cont5 += 1;
                }
            } else {
                cont2 += 1;
            }
            if (n==000){
                System.out.println("Numeros positivos:"+cont1);
                System.out.println("Numeros negativos:"+ (cont2 - 1));
                System.out.println("Numeros pares:"+cont3);
                System.out.println("Numeros impares:"+cont4);
                System.out.println("Numeros multiplos de 8:"+cont5);
                break;
            }
        }
    }
}
