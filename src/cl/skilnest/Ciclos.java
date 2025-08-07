package cl.skilnest;

import java.util.ArrayList;
import java.util.List;

public class Ciclos {
    public static void main(String[] args) {
        // bucle for
        for (int i =1; i <= 7; i++){
            System.out.println("i = " + i);
        }
        /* List<String> colores = List.of("Red", "Blue", "Green", "Yellow");
        colores.add(0, "White");
        System.out.println("colores: " + colores);
        El listado no se puede modificar
        */

        System.out.println("**********************");
        // ArrayList<String> colores2 = (ArrayList<String>) List.of("Red", "Blue", "Green", "Yellow");
        ArrayList<String> listaColores = new ArrayList<>(List.of("Rojo","Blanco","Azul","Negro"));

        System.out.println("colores: " + listaColores);

        listaColores.add("Verde");
        System.out.println("colores: " + listaColores);

        System.out.println("**********************");

        for(String color: listaColores){
            System.out.println("El color es "+color);
        }

        // TODO realizar un menu donde el usuario elija sus opciones






    }
}
