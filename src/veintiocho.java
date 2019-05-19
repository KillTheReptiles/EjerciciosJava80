import java.io.*;
class veintiocho {

    public static void main(String[] args)  throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        {
            System.out.print("Escriba un numero : ");
            int a;
            a = Integer.parseInt(br.readLine());

            while (a > 0){
                System.out.print("Es Positivo");
                break;
            }
            while (a == 0) {
                System.out.print("Es neutro");
                break;
            }
            while ( a < 0 ) {
                System.out.print("Es negativo");
                break;
            }
        }
    }
}


