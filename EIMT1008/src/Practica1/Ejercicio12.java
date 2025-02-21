package Practica1;

public class Ejercicio12 {
    public static void main(String[] args){
        prueba("hola", 1);
        prueba("12345 hold  dfdf ", 3);
        prueba("  feef ef", 2);
        prueba("fdsf   fdf  fd d    f ", 5);
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

    public static void prueba(String cadena, int esperado) {
        int resultado = contarPalabras(cadena);
        System.out.format("Prueba con %s --> %s: ", cadena, resultado);
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.format("error (se esperaba%s)%n", esperado);
    }
}
