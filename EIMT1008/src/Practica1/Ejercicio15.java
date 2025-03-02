package Practica1;

import java.util.Arrays;

public class Ejercicio15 {
    public static void main(String[] args){
        prueba(new String[]{"aa", "bb", "cc", "dd"}, true);
        prueba(new String[]{"aa", "bb", "cc", "dd"}, true);
        prueba(new String[]{"dfa", "a", "d", "a"}, false);
        prueba(new String[]{"bb", "bb", "cc", "dd"}, true);
    }

    public static boolean estaOrdenadoMenorMayor(String[] vector){
        boolean ordenado = true;
        String valorAcomparar = vector[0];
        for (int i=1; i<vector.length;i++){
            if(valorAcomparar.compareTo(vector[i]) > 0){
                ordenado = false;
            }
            valorAcomparar = vector[i];
        }
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
