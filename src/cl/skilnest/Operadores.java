package cl.skilnest;

public class Operadores {
    public static void main(String[] args) {
        //Operadores Aritmeticos
        // + - * / % (%esto es el resto de dividir uno por otro)

        int numero1 = 14;
        int numero2 = 3;

        // int numero1 = 15; numero2 = 3; tambien es valido

        int suma = numero1 + numero2; // 18
        int resta = numero1 - numero2; //12
        int producto = numero1 * numero2; //45
        double division = (double) numero1 / numero2; //5

        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("producto = " + producto);
        System.out.println("division = " + division);

        int modulo = numero1 % numero2;
        System.out.println("El modulo o resto de dividir es = " + modulo);



    }
}
