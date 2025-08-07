package cl.skilnest;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        // Arreglo unidimensional
        /* variable (también llamado array de una dimensión) es una estructura
        que permite almacenar múltiples elementos del
        mismo tipo en una única variable indexada.
        Comienzan en la posicion cero
        */

        int[] numerosImpares = new int[5];
        // agregar valores
        numerosImpares[2]=10;
        numerosImpares[1]=20;
        numerosImpares[0]=20;
        // numerosImpares.length(); entrega la cantidad de datos

        System.out.println("Elementos de Arregle"+Arrays.toString(numerosImpares));
        System.out.println("Cantidad de elementos "+numerosImpares.length);


        for(int i=0;i<numerosImpares.length;i++){
            System.out.println("Posición " + i + " elemento " + numerosImpares[i]);
        }

        System.out.println("***********************************");

        int[] numeros = {2,4,6,8,10};
        for (int numero : numeros) { // numeros = 2
            System.out.println(numero);
        }
        int[] numerosPares = numeros; // no es copia
        numeros[4]=12;
        System.out.println("Elementos de Arregle"+Arrays.toString(numerosPares));

        /*Como respaldar un arreglo? tarea */

        System.out.println("***********************************");
        String[] vocales = {"a","e","i","o","u"};
        for (String vocal : vocales) {
            System.out.println(vocal);
        }

        System.out.println("***********************************");

        //Arreglo Bidimensional

        int[][] matriz = {
                {1,2,3}, //el primer elemento esta en la posicion 0 (cero) fila 0
                {4,5,6,3}
        };
        System.out.println("Matriz A");
        System.out.println(matriz[0][0]);

        System.out.println("***********************************");


        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();

        }

    }
}
