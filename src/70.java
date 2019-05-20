import java.util.Scanner;
public class Ejercicio70 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número en Binario ¨Ejem:110 = 6 O 11 = 3¨ Sin encadenar:");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int suma = 0;
        int i = 0;
        while (i < n){
            //Aqui busque la forma de darle una variable a la operacion pero no e sabido como xd
            lastnumber = n%10;
            n=int(n%10);
            if ((lastnumber == 0 or lastnumber == 1)){
                suma = suma + 2 ** i * lastnumber == 1;
            }
            i=i+1
        }
        System.out.print(suma);
    }
}
