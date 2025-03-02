package Practica1;

import java.util.Arrays;

public class Ejercicio17 {
    public static void main(String[] args){
        prueba(new int[] {1,2,3,4}, false);
        prueba(new int[] {1,2,2,4}, true);
        prueba(new int[] {1}, false);
        prueba(new int[] {11,22,33,44}, false);
    }

    public static boolean hayRepetidos(int[] vector){
        boolean repetidos = false;
        int recorrerVector = 0;
        while((recorrerVector < vector.length) && !repetidos){
            int numeroAcomprobar = vector[recorrerVector];
            for(int i=recorrerVector+1; i < vector.length;i++){
                if(numeroAcomprobar == vector[i]){
                    repetidos = true;
                }
            }
            recorrerVector++;
        }
        return repetidos;
    }

    public static void prueba(int[] vector, boolean esperado){
        boolean resultado = hayRepetidos(vector);
        System.out.format("Prueba con %s --> %s ", Arrays.toString(vector), resultado);
        if (resultado == esperado){
            System.out.println(": ok");
        }else{
            System.out.format(": ERROR, valor esperado : %s", esperado);
        }
    }
}
