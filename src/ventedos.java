import java.io.*;
class segundosminutos{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        {
            float seg,min;
            System.out.print("Ingrese los segundos :");
            seg=Integer.parseInt(br.readLine());

            min=seg/60;

            System.out.print("En minutos es: "+min);
        }
    }
}