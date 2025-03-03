package Practica1;

import java.util.Arrays;

public class Ejercicio22 {
    public static void main(String[] args){
        int[] vectorOrdenado = {1, 3, 5, 7, 8,9};

        // Pruebas
        prueba(vectorOrdenado, 4, 2);
        prueba(vectorOrdenado, 7, 3);
        prueba(vectorOrdenado, 8, 4);
        prueba(vectorOrdenado, 9, 5);
        prueba(vectorOrdenado, 5, 2);
        prueba(vectorOrdenado, 10, 6);
        prueba(vectorOrdenado, 1, 0);
    }

    public static int posicionInsercion(int[] vectorOrdenado, int valor ){
        int posicion = -1;
        int contadorVector = 0;
        while(contadorVector < vectorOrdenado.length && posicion==-1){
            if(contadorVector!=0){
                if(contadorVector != vectorOrdenado.length-1){
                    if((vectorOrdenado[contadorVector] < valor) && (valor < vectorOrdenado[contadorVector+1])){
                        posicion = contadorVector+1;
                    }else if (vectorOrdenado[contadorVector] == valor){
                        posicion = contadorVector;
                    }
                }else if (vectorOrdenado[contadorVector]==valor){
                    posicion = contadorVector;
                }else {
                    posicion = contadorVector+1;
                }


            }else if(vectorOrdenado[contadorVector] == valor){
                posicion=contadorVector;
            }
            contadorVector++;
        }

        return posicion;
    }

    public static void prueba(int[] vector, int numero, int esperado) {
        int resultado = posicionInsercion(vector, numero);
        System.out.format("Prueba con %s, %d --> %d", Arrays.toString(vector), numero, resultado);
        if (resultado == esperado) {
            System.out.println(": ok");
        } else {
            System.out.format(": ERROR, valor esperado : %d\n", esperado);
        }
    }
}
