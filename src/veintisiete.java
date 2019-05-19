import java.io.*;
class veintisiete {

    public static void main(String[] args)  throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        {
            System.out.print("Escriba un numero : ");
            int a;
            a = Integer.parseInt(br.readLine());

            if (a % 2 == 0) {
                System.out.print("Es Par");
            } else {
                System.out.print("Es impar");
            }
        }
    }
}

