package cl.skilnest;

import java.util.Scanner;

public class Presentacion {
    public static void main(String[] args) {
        // Solicitar y mostrar sus datos personales
        //Nombre, Apellido, edad, dirección y correo
        // mostrar mensaje con toda la información

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus datos Personales: ");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar salto de linea anterior de int
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();

        System.out.println("Tus datos ingresados ");
        System.out.println("Datos: " + nombre +" "+ apellido +", Edad: "+ edad +", Dirección: "+ direccion +", Correo: "+ correo);

        /* Marcador	Tipo	Ejemplo
%s	Texto	"Hola"
%d	Entero	42
%f	Decimal	3.14 (puedes usar %.2f para 2 decimales)
%n	Nueva línea	como \n pero portátil */

        sc.close();
        //String.format
        String cadena = String.format("Hola %s %s. tienes %d años, tu dirección es %s ",nombre,apellido,edad,direccion);
        System.out.println(cadena);
    }

}
