package Practica1;

import java.util.Arrays;

public class Ejercicio15 {
    public static void main(String[] args){

    }

    public static boolean estaOrdenadoMenorMayor(String[] vector){
        boolean ordenado = true;

        return ordenado;
    }

    public static void prueba(String[] vector, boolean esperado){
        boolean resultado = estaOrdenadoMenorMayor(vector);

        System.out.format("Prueba con %s --> %s: ", Arrays.toString(vector) ,resultado);
        if (resultado == esperado) {
            System.out.println("ok");
        }else {
            System.out.format("error (se esperaba %s)%n", esperado);
        }
    }
}
