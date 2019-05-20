import java.util.Collections;
import java.util.Scanner;
import  java.util.ArrayList;
import java.util.List;
public class Ejercicio77 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        int capmax = 18000;
        int peso = 0;
        int ganancias = 0;
        int nt = 0;
        List mp = new ArrayList();
        List ml = new ArrayList();
        for (int i = 1; i < 601; i++){
            lista.add(i);
            Collections.shuffle(lista);
        }
        while (peso < capmax){
            System.out.println("Peso del bulto"+ lista[0]);
            if (lista[0] < 25){
                peso += lista[0];
                nt += 1;
                ml.add(lista[0]);
            } else {
                if (lista[0] < 300);
                ganancias += 1500;
                peso += lista[0];
                nt += 1;
                ml.add(lista[0]);
            } else {
                if (lista[0] < 500){
                    ganancias += 2500;
                    peso += lista[0];
                    nt += 1;
                    ml.add(lista[0]);
                } else {
                    System.out.print("Muy pesado no se permite");
                }
            }
        }
        System.out.print("Bultos ingresados"+ nt);
    }
}