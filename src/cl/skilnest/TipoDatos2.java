package cl.skilnest;

import java.util.ArrayList;

public class TipoDatos2 {
    public static void main(String[] args) {
        // Autoboxing
        int numero = 38;
        // estamos pasando un primitivo a variable tipo objetivo
        Integer numerObjeto =numero;

        // Unboxing:

        // convertir un objeto a primitivo

        int numero2 = numerObjeto;

        System.out.println("El entero es "+numero);
        System.out.println("El objeto es "+numerObjeto);
        System.out.println("El Unboxing es "+numero2);

        /* Wrapper

         */
        String texto = "1234";
        int numero3 = Integer.parseInt(texto); // se usa un objeto Integer transformando con parse el numero de String

        // 3 formas como transformar de un obetvo a string
        String texto2 = String.valueOf(numero3);
        Integer numero4 = Integer.parseInt(texto2);
        String texto3 = numero4.toString();
        String texto4 = Integer.toString(numero4);
        System.out.println("El objeto es "+numero3);
        String texto5 = String.format("%s",numero4);

        System.out.println("El objeto es "+texto3);
        System.out.println("El objeto es "+texto4);
        System.out.println("El objeto es "+texto5);
        System.out.println("El objeto es "+texto2);


        // ------------------

        double decima = Double.parseDouble("8.8");
        System.out.println("El objeto es "+decima);
        boolean existe = Boolean.parseBoolean("TrUe"); // no importa como escribas true siempre te dara true,
        boolean existe2 = Boolean.parseBoolean("hola"); //  si entregas otro valor siempre arrojara false

        System.out.println("Existe? "+existe);
        System.out.println("Existe2? "+existe2);


        // --------------------------ArrayList - -----------
        ArrayList<Integer> lista_numeros = new ArrayList<>();
        System.out.println(lista_numeros);
        System.out.println(lista_numeros.size());
        lista_numeros.add(1);
        lista_numeros.add(2); // se agrega al final de la lista
        System.out.println(lista_numeros);

        for (Integer elemento : lista_numeros) {
            System.out.println(elemento);
        }

        /*           Comparaciones      */

        int numeroA = 100;
        int numeroB = 100;

        System.out.println(numeroA == numeroB); // compaara valores

        Integer numeroC = 200;
        Integer numeroD = 200;

        System.out.println(numeroC == numeroD); // compara objeto
        System.out.println(numeroC.equals(numeroD)); // true , compara los valores objeto

        String nombre = "Cristian";
        String name = "Cristian";

        System.out.println("== "+ (nombre == name));
        System.out.println(nombre.equals(name));

    /* ****************valores por Default ****************/

    int edad = 0;
    System.out.println(edad);
    char letra = 0; // el caracter es unicode por lo tanto es nulo
    System.out.println("La letra es "+ letra);

    // se puede generar varios tipos de datos y despues inicializar dandoles valores.

        String blancoYNegro, rojo;


    }
}
