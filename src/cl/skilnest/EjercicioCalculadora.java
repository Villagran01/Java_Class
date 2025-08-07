package cl.skilnest;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        ArrayList<String> historial = new ArrayList<>();

        int opcion;

        do {
            System.out.println("===== MENÚ CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Ver historial de operaciones");
            System.out.println("6. Salir");
            System.out.print("Elige una opción (1-6): ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                numeros.clear(); // Limpiar lista antes de cada operación

                System.out.print("Ingresa el primer número: ");
                numeros.add(scanner.nextDouble());

                System.out.print("Ingresa el segundo número: ");
                numeros.add(scanner.nextDouble());

                double num1 = numeros.get(0);
                double num2 = numeros.get(1);
                double resultado;
                String operacionTexto = "";

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        operacionTexto = "Suma: " + num1 + " + " + num2 + " = " + resultado;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        operacionTexto = "Resta: " + num1 + " - " + num2 + " = " + resultado;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        operacionTexto = "Multiplicación: " + num1 + " * " + num2 + " = " + resultado;
                        break;
                    case 4:
                        if (num2 == 0) {
                            operacionTexto = "Error: División entre cero no permitida.";
                        } else {
                            resultado = num1 / num2;
                            operacionTexto = "División: " + num1 + " / " + num2 + " = " + resultado;
                        }
                        break;
                }

                System.out.println(operacionTexto);
                historial.add(operacionTexto);

            } else if (opcion == 5) {
                System.out.println("===== HISTORIAL DE OPERACIONES =====");
                if (historial.isEmpty()) {
                    System.out.println("No se han realizado operaciones aún.");
                } else {
                    for (String operacion : historial) {
                        System.out.println(operacion);
                    }
                }
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println(); // Espacio entre iteraciones
        } while (opcion != 6);

        scanner.close();

    }
}
