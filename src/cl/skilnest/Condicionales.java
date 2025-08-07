package cl.skilnest;

public class Condicionales {
    public static void main(String[] args) {

        // condicionales
        int numero1 = 7;

        if (numero1 % 2 == 0) {
            System.out.println("El numero es par ");
        }else {
            System.out.println("El numero es impar ");

        }
        System.out.println("******************************");
        int numero = 2;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es negativo.");
        }
        System.out.println("******************************");

        //V i V = V //and (&&)

        //Operador “and” (&&): Devuelve true si ambas expresiones boleanas son verdaderas; de lo contrario, devuelve false.
        boolean expresion1 = true;
        boolean expresion2 = false;
        boolean resultado1 = expresion1 && expresion2;
        System.out.println("El resultado 3 es: " + resultado1);//false

        if (expresion1 && expresion2) {
            System.out.println("Operador and(&&)");
        }


        /* **
         * Operador “or” (||): Devuelve true si al menos una de las expresiones booleanas es verdadera; devuelve false solo si ambas expresiones son falsas.
         */
        // 0>0 = Falso o 0=0 = verdadero
        //basta una valor verdadero y todo es verdad
        //F v F = F //or (||)
        boolean expresion3 = true;
        boolean expresion4 = false;
        boolean resultado2 = expresion4 || expresion3;
        System.out.println("El resultado 4 es: " + resultado2);

        System.out.println("El resultado !4 es: " + !resultado2);
        System.out.println("El resultado !4 es: " + !(expresion4 || expresion3));

        System.out.println("******************************");

        int edad = 20;
        String mayorDeEdad = (edad >=18) ? "Mayor de Edad" : "Menor de Edad";
        // resumen de un if / else
        System.out.println(mayorDeEdad);




        System.out.println("******************************");




        /* *
         * Switch
         * **/
        int opcion = 8;
        switch (opcion) {
            //en el case se evalua el contenido de la variable
            case 1:
                System.out.println("Es el Lunes");
                break;
            case 2:
                System.out.println("Es el Martes");
                break;
            case 3:
                System.out.println("Es el Miercoles");
                break;
            case 4:
                System.out.println("Es el Jueves");
                break;
            case 5:
                System.out.println("Es el Viernes");
                break;
            case 6:
                System.out.println("Es el Sabado");
                break;
            case 7:
                System.out.println("Es el Domingo");
                break;
            default:
                System.out.println("switch: Indeterminado o no es un dia de la semana");
                break;
        }
        System.out.println("Fuera del switch");

    }



}
