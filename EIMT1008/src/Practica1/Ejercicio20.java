package Practica1;

import java.util.Arrays;

public class Ejercicio20 {
    public static void main(String[] args){
        prueba(new int[]{}, 3, new int[]{});
        prueba(new int[]{1,2,3}, 3, new int[]{1,2});
        prueba(new int[]{1,3,3,2,3,2,3}, 3, new int[]{1,2,2});
        prueba(new int[]{1,1,3,1}, 3, new int[]{1,1,1});
        prueba(new int[]{1,1}, 1, new int[]{});
    }

    public static int[] eliminarValor(int[] vector, int numero){
        int cantidadNumerosElmininar = 0;
        for(int i=0; i<vector.length; i++){
            if(vector[i]==numero){
                cantidadNumerosElmininar++;
            }
        }
        int[] nuevoVector = new int[vector.length - cantidadNumerosElmininar];
        int contadorNuevoVector = 0;
        for(int i=0; i<vector.length; i++){
            if (vector[i]!=numero){
                nuevoVector[contadorNuevoVector] = vector[i];
                contadorNuevoVector++;
            }
        }
        return nuevoVector;
    }

    public static void prueba(int[] vector, int numero, int[] esperado){
        int[] resultado = eliminarValor(vector, numero);
        System.out.format("Prueba con %s, %s --> %s", Arrays.toString(vector), numero, Arrays.toString(resultado));
        if (Arrays.equals(resultado, esperado)){
            System.out.println(": ok");
        }else{
            System.out.format(": ERROR, valor esperado : %s\n", Arrays.toString(esperado));
        }
    }
}
