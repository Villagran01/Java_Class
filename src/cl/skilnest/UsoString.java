package cl.skilnest;

public class UsoString {
    public static void main(String[] args) {
        String frase = "     Java es GENIAL   ";

        // Longitud original con espacios
        System.out.println("Longitud original: " + frase.length());

        // Quitar espacios al inicio y al final
        frase = frase.strip();

        // Longitud después de quitar espacios
        System.out.println("Frase sin espacios: '" + frase + "'");
        System.out.println("Longitud final: " + frase.length());

        frase = frase.toLowerCase(); // cambia tocas las letras a minusculas
        System.out.println(frase);

        System.out.println(frase.length()); // para ver la cantidad de caracteres

        // Verificar si la frase contiene la palabra "genial"
        if (frase.contains("genial")) {
            System.out.println("La frase contiene la palabra 'genial'");
        }

        // Cambiar la frase "genial" por "poderoso"
        frase = frase.replace("genial", "poderoso");
        System.out.println(frase);

        // Mostrar la posición de la palabra "es"
        int posicion = frase.indexOf("es");
        System.out.println("La palabra 'es' está en la posición " + posicion);

        String str = "Hola Mundo";
        int posicion2 = str.indexOf("Mundo"); // Encuentra la posición de "Mundo" en la cadena
        System.out.println(posicion2); // Salida: 5
    }
}