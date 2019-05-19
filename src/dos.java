// Importamos scanner para hacer input en string
import java.util.Scanner;
public class dos {
    public static void main(String[] args){
        //Mediante scanner creamos un input para que haga ingreso
        //de cualquier valor por medio de Strings
        Scanner input = new Scanner(System.in);
        //Saludamos y utilizamos "\n" para que haya un espacio
        System.out.print("Hola! Vamos a saludarte.\n");
        //Solicitamos el nombre
        System.out.print("Por favor ingresa tu nombre: ");
        //Llamamos la variable input como función para que ingrese
        //los valores en String
        String nombre= input.next();
        //Simplemente hacemos que añada el texto con un string más la variable
        // y lo imprimimos
        System.out.print("Hola "+nombre);
    }
}
//Desarrollado por Pedro Gómez , Duvan , Sebastián Gelves y Wilson
