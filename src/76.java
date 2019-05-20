import java.util.Scanner;
public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un usuario");
        int n = entrada.nextInt();
        System.out.println("Digite una contraseña");
        int i = entrada.nextInt();
        System.out.print(("/////////////////////////////////////////////////////////"));
        int contfail = 0
        while ((true) && contfail < 3){
            System.out.println("Digite un usuario");
            int n = entrada.nextInt();
            System.out.println("Digite una contraseña");
            int i = entrada.nextInt();
            if (n == n && i == i){
                System.out.print("El usuario y el psw coinciden");
                break;
            } else {
                System.out.print("Asegurece de digitar bien");
                int contfail += 1;
            }
            if contfail == 3{
                System.out.print("Vuelva mas tarde");
            }
        }
    }
}