package cl.skilnest;


import java.util.Scanner;

public class SumaNumero {
    public static void main(String[] args) {
        // definir la variable scanner, encargada de capturar datos ingresados por consula

        Scanner sc = new Scanner(System.in);
        // Entreada de Datos
        System.out.print("Ingrese el primer numero: ");
        // creamos variable numerica
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        // numero 2 proceso
        int suma = num1 + num2;


        // numero 3 salida

        System.out.println("La suma es: " + suma);



        sc.close();

    }
}