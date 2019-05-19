import java.io.*;

import static java.lang.System.out;

class treinta {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        {
            out.print("Escriba un numero :");
            int a1;
            a1 = Integer.parseInt(br.readLine());

            int a2 = (a1 * 19) / 100;
            int a3 = (a1 + a2);
            int a4 = (a3 * 5) / 100;
            int a5 = (a3 - a4);


            if (a1 >= 150000) {
                System.out.print("Valor del producto: " + a1 + "\n");
                System.out.print("IVA :" + a2 + "\n");
                System.out.print("Descuento 5%: " + a4 + "\n");
                System.out.print("Valor Total: " + a5 + "\n");
        }

            else{
                System.out.print("Valor del producto: " + a1 + "\n");
                System.out.print("IVA :" + a2 + "\n");
                System.out.print("Valor Total : " + a3 + "\n");
        }

        }
    }
}
