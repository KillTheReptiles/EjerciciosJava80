import java.io.*;

class treintaydos {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Escribe la nota: ");

        float n1 = Integer.parseInt(br.readLine());

        System.out.print("Escribe la nota: ");
        float n2 = Integer.parseInt(br.readLine());

        System.out.print("Escribe la nota: ");
        float n3 = Integer.parseInt(br.readLine());

        System.out.print("Escribe la nota:");
        float n4 = Integer.parseInt(br.readLine());

        System.out.print("Escribe la nota:");
        float n5 = Integer.parseInt(br.readLine());




        float pn1=n1*15/100;
        float pn2 = n2 * 20 / 100;
        float pn3=n3*15/100;
        float pn4=n4*30/100;
        float pn5=n5*20/100;

        float operacion = pn1+pn2+pn3+pn4+pn5;

        System.out.print("El promedio de las 5 notas es: " + operacion + "\n");

        if (operacion == 2) {
            System.out.print("Habilita\n");
        }
        if (operacion >= 3) {
            System.out.print("Aprobo \n");
        }

        if (operacion < 3) {
            System.out.print("Reprobo\n");
        }

        if (operacion > 4.5) {
            System.out.print("Felicitaciones\n");
        }
    }
}