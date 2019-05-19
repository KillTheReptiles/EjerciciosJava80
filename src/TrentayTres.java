import java.io.*;

class treintaytres {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.print("Escribe un numero: ");
        float n1 = Integer.parseInt(br.readLine());

        System.out.print("Escribe un numero: ");
        float n2 = Integer.parseInt(br.readLine());


        if (n1<=n2) {
            System.out.println("El mayor es: "+ n2);
        }

        else {
            System.out.println("El mayor es: "+ n1);
        }

    }
}