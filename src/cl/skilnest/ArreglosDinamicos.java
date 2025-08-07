package cl.skilnest;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArreglosDinamicos {
    public static void main(String[] args) {
        /**
         * Tamaño dinamico
         * Metodos utiles, operar(agregar, eliminar, buscar elementos)
         * Solo admite objetos
         * */


        // Crear un ArrayList vacio


        ArrayList<Integer> numeros = new ArrayList<>();
        var listaNumeros = new ArrayList<Integer>();
        System.out.println("el arraylist se encuentra sin elementos: "+numeros.isEmpty());

        System.out.println(listaNumeros.size());
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros);

        // indice de elementos
        numeros.add(1,40);
        System.out.println(numeros);
        numeros.add(50);
        numeros.add(60);
        System.out.println(numeros);

        System.out.println("tamaño del ArrayList "+numeros.size());

        System.out.println("******************");

        // remover elementos
        numeros.remove(1); // remueve el elemento que se encuentra en la posicion 1
        System.out.println(numeros);
        numeros.remove(Integer.valueOf(20)); // elimina el elemento con el valor 20
        System.out.println(numeros);

        System.out.println("******************");

        // obtener un elemento por indice
        //numeros.get(1);

        System.out.println(numeros.get(1));

        System.out.println("******************");
        // reemplazar un elemento acorde al indice y su nuevo elemento

        numeros.set(1,35);
        System.out.println(numeros);

        System.out.println("******************");
        // verificar si un elemento existe (true o false)

        System.out.println(numeros.contains(35));
        System.out.println("******************");

        // IndexOf retorna el indice acorde al elemento que buscamos, si no lo encuentra es -1

        System.out.println("El indice del elemento 60 es "+numeros.indexOf(20));

        System.out.println("******************");
        // isEmpty nos retorna si esta vacio o no( true si esta vacio)
        System.out.println("se encuentra vacio? "+numeros.isEmpty());

        System.out.println("********************");

        // clear: elimina todos los elementos
        //numeros.clear();
        System.out.println("se encuentra vacio? "+numeros.isEmpty());

        // Entrega de ultimo y primer elemento
        System.out.println(numeros.getFirst());
        System.out.println(numeros.getLast());

        System.out.println("*******************");

        // recorrer arrayList



        numeros.reversed();
        System.out.println(numeros);
        System.out.println(numeros.reversed()); // es solo temporal para este linea y no es permanente esto

        System.out.println("Usando for clásico:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Índice " + i + ": " + numeros.get(i));
        }

        System.out.println("Usando for-each:");
        for (Integer num : numeros) {
            System.out.println("Valor: " + num);
        }

        System.out.println("Usando forEach con lambda:");
        numeros.forEach(n -> System.out.println("Número: " + n));

        ListIterator<Integer> it = numeros.listIterator();

        System.out.println("Recorrido hacia adelante:");
        while (it.hasNext()) {
            Integer numero = it.next();
            System.out.println(numero);
        }

        System.out.println("Recorrido hacia atrás:");
        while (it.hasPrevious()) {
            Integer numero = it.previous();
            System.out.println(numero);
        }

    }
}
