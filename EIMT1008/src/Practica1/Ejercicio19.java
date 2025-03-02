package Practica1;

import java.util.Arrays;

public class Ejercicio19 {
    public static void main(String[] args){
        prueba(new int[]{}, 2, new int[]{});
        prueba(new int[]{1,2,3,4}, 2, new int[]{1,2,4});
        prueba(new int[]{1,2,3,4}, 3, new int[]{1,2,3});
        prueba(new int[]{1,2,3,4}, -3, new int[]{1,2,3,4});
    }

    public static int[] eliminarPosicion(int[] vector, int posicionVector){
        int[] nuevoVector;
        if((vector.length>0) && (posicionVector >= 0 && posicionVector < vector.length)){
            nuevoVector = new int[vector.length-1];
            int contadorNuevoVector = 0;

            for(int i=0; i<vector.length; i++){
                if(i != posicionVector){
                    nuevoVector[contadorNuevoVector] = vector[i];
                    contadorNuevoVector++;
                }
            }
        }else{
            nuevoVector = vector;
        }

        return nuevoVector;
    }

    public static void prueba(int[] vector, int posicion, int[] esperado){
        int[] resultado = eliminarPosicion(vector, posicion);
        System.out.format("Prueba con %s, %s --> %s", Arrays.toString(vector), posicion, Arrays.toString(resultado));
        if (Arrays.equals(resultado, esperado)){
            System.out.println(": ok");
        }else{
            System.out.format(": ERROR, valor esperado : %s\n", Arrays.toString(esperado));
        }
    }
}
