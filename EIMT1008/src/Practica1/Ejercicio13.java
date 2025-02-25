package Practica1;

public class Ejercicio13 {
    public static void main(String[] args){
        prueba("hola como estas", 1, "hola");
        prueba("hola como estas", 2, "como");
        prueba("hola como estas", 3, "estas");
        prueba("hola como estas", 5, null);
        prueba("  hola como estas", 1, "hola");
        prueba("  hola como estas", 2, "como");
        prueba("  hola  como  estas ", 3, "estas");
        prueba("  hola  como  estas        ", 3, "estas");
    }

    public static String obtenerPalabra(String cadena, int numero){
        int numeroPalabras = contarPalabras(cadena);

        String palabra = null;
        if (numero <= numeroPalabras) {
            int contPalabras = 0;
            int recorrerCadena = 0;
            String crearPalabra = "";
            while ((recorrerCadena < cadena.length())) {
                if (recorrerCadena != 0) {
                    if (cadena.charAt(recorrerCadena - 1) == ' ' && cadena.charAt(recorrerCadena) != ' ') {
                        contPalabras++;
                        if (contPalabras == numero) {
                            int cCaracter = 0;
                            while(((recorrerCadena+cCaracter) < cadena.length()) && (cadena.charAt(recorrerCadena+cCaracter) != ' ')){
                                crearPalabra += cadena.charAt(recorrerCadena+cCaracter);
                                cCaracter++;
                            }
                        }
                    }
                } else if (cadena.charAt(recorrerCadena) != ' ') {
                    contPalabras++;
                    if (contPalabras == numero) {
                        int cCaracter = 0;
                        while(cadena.charAt(recorrerCadena+cCaracter) != ' '){
                            crearPalabra += cadena.charAt(recorrerCadena+cCaracter);
                            cCaracter++;
                        }
                    }
                }
                recorrerCadena++;
            }
            palabra = crearPalabra;
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
        if ((esperado==null && resultado==null) || resultado.equals(esperado))
            System.out.println("ok");
        else
            System.out.format("error (se esperaba %s)%n", esperado);
    }
}
