package Practica1;

import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args){
        prueba(new int[]{1, 2, 3, 4, 5}, 1, 0);
        prueba(new int[]{1,1,2,1, 2, 3, 4, 5}, 1, 3);
        prueba(new int[]{1, 2, 3, 4, 5,5,5,5}, 5, 7);
        prueba(new int[]{1, 2, 3, 4,3, 5}, 3, 4);
    }

    public static int ultimaPosicion(int[] vector, int numeroEntero){
        int posicion = -1;
        for (int i=0; i<vector.length; i++){
            if(numeroEntero == vector[i]){
                posicion = i;
            }
        }
        return posicion;
    }

    public static void prueba(int[] vector, int numero, int numeroEsperado){
        int resultado = ultimaPosicion(vector, numero);
        System.out.format("Prueba con %s y %s --> %s: ", Arrays.toString(vector), numero ,resultado);
        if (numeroEsperado == resultado){
            System.out.println("ok");
        }else {
            System.out.format("error (se esperaba %s)%n", numeroEsperado);
        }
    }
}
