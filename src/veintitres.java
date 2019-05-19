//Importamos Scanner
import java.util.Scanner;
public class veintitres {
    public static void main(String[] args){
        //Creamos input
        Scanner input = new Scanner(System.in);
        System.out.print("Hola! Vamos a convertir los segundos a formato HH:MM:SS \n");
        System.out.print("Por favor ingresa los segundos: ");
        //Solicitamos los segundos y creamos fórmulas
        int seg= input.nextInt();
        double minutos = seg/ 60;
        int segundos_res=(int)(seg%60);
        int horas = (int)(minutos/60);
        int minutos_res= (int)(minutos%60);
        //Imprimimos los resultados
        System.out.println("El formato de segundos a hh:mm:ss es "+horas+":"+minutos_res+":"+segundos_res+". Gracias por utilizar el programa.");
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson