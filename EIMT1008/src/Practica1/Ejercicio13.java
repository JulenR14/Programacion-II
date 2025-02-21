package Practica1;

public class Ejercicio13 {
    public static void main(String[] args){

    }

    public static String obtenerPalabra(String cadena, int numero){
        int numeroPalabras = contarPalabras(cadena);

        String palabra = null;
        if (numero <= numeroPalabras) {
            int contPalabras = 0;
            
        }

        return palabra;
    }

    public static int contarPalabras(String cadena){
        int numeroPalabras = 0;

        for (int i=0; i<cadena.length(); i++) {
            if(i!=0){
                if(cadena.charAt(i-1) == ' ' && cadena.charAt(i) != ' '){
                    numeroPalabras ++;
                }
            }else if(cadena.charAt(i) != ' '){
                numeroPalabras ++;
            }
        }

        return numeroPalabras;
    }

    public static void prueba(String cadena, int numeroEntero, String esperado){
        String resultado = obtenerPalabra(cadena, numeroEntero);

        System.out.format("Prueba con %s y %s --> %s: ", cadena, numeroEntero ,resultado);
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.format("error (se esperaba%s)%n", esperado);
    }
}
