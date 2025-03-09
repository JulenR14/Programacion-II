package Practica1.Ejercicio_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] matriz = crearMatrizCombinaciones(new String[]{"tierra", "fuego" ,"lava" ,"aire" ,"piedra" ,"agua", "arena" ,"cristal" ,"reloj_de_arena"}, "./src/Practica1/Ejercicio_24/alquimia10.txt");
        for (int i = 0; i < matriz.length; i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    public static int[][] crearMatrizCombinaciones(String[] vector, String nombreFichero) throws FileNotFoundException {
        int[][] matrizCombinaciones = new int[vector.length][vector.length];

        for (int i = 0; i < matrizCombinaciones.length; i++){
            for (int j = 0; j < matrizCombinaciones[i].length; j++){
                Scanner sc = new Scanner(new File(nombreFichero));
                String elemento1 = vector[i];
                String elemento2 = vector[j];
                if (sc.hasNext()){
                    //String[] lineaElementos = sc.nextLine().split(" ");
                   String[] lineaElementos = new String[]{sc.next(), sc.next(), sc.next()};
                    if (elemento1.equals(lineaElementos[0]) && elemento2.equals(lineaElementos[1]) ||
                        elemento2.equals(lineaElementos[0]) && elemento1.equals(lineaElementos[1]) ||
                        elemento1.equals(lineaElementos[0]) && elemento1.equals(lineaElementos[1]) ||
                        elemento2.equals(lineaElementos[0]) && elemento2.equals(lineaElementos[1])){
                        matrizCombinaciones[i][j] = 2;
                    }else {
                        matrizCombinaciones[i][j] = -1;
                    }
                }
                sc.close();
            }
        }
        
        return matrizCombinaciones;
    }
}
