import java.lang.String;
import java.io.*;

class cuarenta {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.print("Escribe tu usuario: ");
        int u = Integer.parseInt(br.readLine());

        System.out.print("Escribe tu contraseña: ");
        int p = Integer.parseInt(br.readLine());

        String user = ("KTR");
        String password = ("1234");

        if (user == u) {
        System.out.println("Tu usuario es correcto");
         } else {
             System.out.println("Tu usuaro es incorrecto");
         }


         if (password == p) {
             System.out.println("Tu contraseña es correcta");
        } else {
            System.out.println("Tu contraseña es incorrecta");
         }

    }
}