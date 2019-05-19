import java.io.*;
class veintinueve {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        {
            System.out.print("Escriba un numero :");
            int a;
            a = Integer.parseInt(br.readLine());


            while (a > 0) {
                System.out.print("-Es positivo\n");
                break;
            }

            if (a % 2 == 0) {
                System.out.print("-Es par\n");
            }
            else {
                System.out.print("-Es impar\n");
            }


            while (a < 0) {
                System.out.print("-Es negativo\n");
                break;
            }

        }
    }
}