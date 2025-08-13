package cl.skilnest;

public class MetodosEstaticos {
    public static void main(String[] args) {
        // llamado al metodo
        int retorno =sumar(7,3);
        System.out.println("El resultado es "+retorno);

        restaDosNumeros();
        restaDosNumeros(10.5, 2);
        restaDosNumeros(10, 2.5);

    }
    public static int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    public static void restaDosNumeros(){
        System.out.println("El resultado es "+(10-2));
    }
    /**
     * Sobrecarga de metodos
     */
    public static void restaDosNumeros(double num3, int num4){
        System.out.println("El resultado es "+(num3-num4));
    }
    public static void restaDosNumeros(int num3, double num4){
        System.out.println("El resultado es "+(num3-num4));
    }
}
