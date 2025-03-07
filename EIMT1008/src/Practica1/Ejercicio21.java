package Practica1;

import java.util.Arrays;

public class Ejercicio21 {
    public static void main(String[] args){
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {2, 4};
        int[] vector3 = {2, 6};

        // Pruebas
        prueba(vector1, vector2, true);
        prueba(vector1, vector3, false);
    }

    public static boolean contiene(int[] vector, int numero){
        boolean aparece = false;
        int contadorVector = 0;
        while(contadorVector < vector.length && !aparece){
            if(vector[contadorVector] == numero){
                aparece = true;
            }
            contadorVector++;
        }
        return aparece;
    }

    public static boolean contiene(int[] vector1, int[] vector2){
        boolean aparecen = true;
        int contadorVector = 0;
        while (contadorVector < vector2.length && aparecen){
            aparecen = contiene(vector1, vector2[contadorVector]);
            contadorVector++;
        }
        return aparecen;
    }

    public static void prueba(int[] vector1, int[] vector2, boolean esperado) {
        boolean resultado = contiene(vector1, vector2);
        System.out.format("Prueba con %s, %s --> %s", Arrays.toString(vector1), Arrays.toString(vector2), resultado);
        if (resultado == esperado) {
            System.out.println(": ok");
        } else {
            System.out.format(": ERROR, valor esperado : %s\n", esperado);
        }
    }
}
