package presentacion;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Bienvenidos al curso de Java";

        String cadenaMayusculas = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas:");
        System.out.println(cadenaMayusculas);
        System.out.println("");

        System.out.println("Cadena en minúsculas:");
        String cadenaMinusculas = cadena.toLowerCase();
        System.out.println(cadenaMinusculas);
        System.out.println("");

        System.out.println("Mostrar primera palabra de la cadena:");
        String palabra = cadena.substring(0, cadena.indexOf(" "));
        System.out.println(palabra);
        System.out.println("");

        System.out.println("Mostrar solo la palabra Java:");
        int posicionJava = cadena.indexOf("Java");
        String java = cadena.substring(posicionJava);
        System.out.println(java);
        System.out.println("");;

        System.out.println("Mostrar solo la palabra curso:");
        String[] palabras = cadena.split(" ");
        System.out.println(palabras[2]);
        System.out.println("");;

        System.out.println("Mostrar la posición de la letra c");
        int posicion = cadena.indexOf('c');
        System.out.println("La letra c se encuentra en la posición " + posicion);
        System.out.println("");

        System.out.println("Mostrar la longitud de la cadena");
        System.out.println("Longitus de la cadena: " + cadena.length());
        System.out.println("");

        System.out.println("Cambiar las e por E:");
        String nuevaCadena = cadena.replaceAll("e", "E");
        System.out.println(nuevaCadena);
        System.out.println("");

        System.out.println("Concatenar la frase anterior con “con fecha 14 de Septiembre:”");
        String cadena2="con fecha 14 de Septiembre ";
        System.out.println(cadena + cadena2);


    }
}