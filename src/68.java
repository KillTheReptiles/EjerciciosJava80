import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Ejercicio68 {
    public static void main(String[] args) {
        List ln = new ArrayList();
        List ln2 = new ArrayList();
        int cont1=0;
        while (cont1 < 100){
            for (int i=1; i<201; i++){
                ln.add(i);
                Collections.shuffle(ln);
            }
            // Aqui queria decirle al programa que asignara una variable al numero en la posicion 0 de la lista para hacer las 
            //operaciones y las condiciones, no supe como, definir una variable a eso xd
            //Sin embargo algo asi tenia en mente xd PD(En python funciona)
            c = ln.get(0);
            if (ln(0) % 2 == 0){
                if (ln Contains ln(0) == (false)){
                    ln2.add(ln(0));
                    cont1 += 1;
                }
                System.out.print("Numeros leidos:"+ ln2);
                System.out.print("Cantidad de leidos:"+cont1);
            }
        }
    }
}
