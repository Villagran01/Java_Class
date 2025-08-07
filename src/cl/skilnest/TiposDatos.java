package cl.skilnest;

public class TiposDatos {
    public static void main(String[] args) {
        /* En Java, una variable es una referencia a un espacio de memoria que contiene un valor.
        Debe declararse con un tipo de dato.
         */
        // tipos de datos primitivos

        //int
        int edad = 10;

        //double
        double altura = 1.79; // se dete usar . para decimales no ,

        // bolean
        boolean estado = true; // logico, verdadero o falso

        //char
        char volca_a = 'a'; // los char se usan con comillas simples y se hace a una letra.

        // float, long, byte, short
        // el byte va del -127 al 128
        // short −32,768 a 32,767
        //byte - short - int - flota - double - long

        // flota
        float precio = 123456.5f; // este tiene una particularidad se debe agregar la f al final

        // long
        long numero_grande = 1235463124L; // solo numeros enteros y se coloca la L mayuscula

        // Tipos de Referencias

        // String

        String nombre = "Cristian";

        Integer numero1 = 12346;



        System.out.println("int edad = " + edad);
        System.out.println("double altura = " + altura);
        System.out.println("boolean estado = " + estado);
        System.out.println("char volca_a = " + volca_a);
        System.out.println("float precio = " + precio);
        System.out.println("long numero_grande = " + numero_grande);
        System.out.println("String nombre = " + nombre);
        System.out.println("Integer numero1 = " + numero1);



    }
}
