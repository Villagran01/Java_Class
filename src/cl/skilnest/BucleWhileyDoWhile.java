package cl.skilnest;

public class BucleWhileyDoWhile {
    public static void main(String[] args) {
        // while

        int contador = 0;
        System.out.println("Inicio de While");
        while (contador > 0) {
            //contador = contador + 1;
            System.out.println("Contador = " + contador);

        }
        System.out.println("Fin de While");
        System.out.println("Inicio de DoWhile");
        do {
            System.out.println("Dentro de do While");
        }while (contador >0);
        System.out.println("Fin de DoWhile");


    }
}
