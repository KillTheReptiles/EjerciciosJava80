import java.io.*;

class TrentayCinco {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.print("Escribe un numero : ");
        float n1 = Integer.parseInt(br.readLine());

        System.out.print("Escribe un numero: ");
        float n2 = Integer.parseInt(br.readLine());

        System.out.print("Escribe un numero: ");
        float n3 = Integer.parseInt(br.readLine());

        if (n1>n2) {
            if (n1>n3) {
                System.out.println("El mayor es: "+ n1);
            }
        }

        else {
            if (n2 > n1) {
                if (n2 >n3) {
                    System.out.println("El numero mayor es "+ n2);
                }
                else{
                    System.out.println("El numero mayor es "+ n3);
                }
                }
            }





        if (n1<n2) {
            if (n1 < n3) {
                System.out.println("El Menor es: "+ n1);
            }
        }


        else {
            if (n2 < n1) {
                if (n2 < n3) {
                    System.out.println("El Menor es: "+ n2);
                }
            }
            else{
                System.out.println("El Menor es: "+ n3);
        }

        }

    }
}