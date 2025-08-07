package cl.skilnest;

public class CondicionalyBucle {
    public static void main(String[] args) {
        //Condicionales

        int numero1 = 7;

        if (numero1 % 2 == 0) {
            System.out.println("El numero es par ");
        }else  {
            System.out.println("El numero es impar ");
        }
        //switch
        switch (numero1) {
            case 1:
                System.out.println("Es el lunes ");
                break;
            case 2:
                System.out.println("Es el Martes ");
                break;
            case 3:
                System.out.println("Es el Miercoles ");
                break;
            case 4:
                System.out.println("Es el Jueves ");
                break;
            case 5:
                System.out.println("Es el Viernes ");
                break;
            case 6:
                System.out.println("Es el Sierra ");
                break;
            case 7:
                System.out.println("Es el Domingo ");
                break;
        default:
            System.out.println("Indeterminado ");
            break;
        }
        // bucle for
        for (int i =1; i <= 7; i++){
            System.out.println("i = " + i);


        }


    }
}
