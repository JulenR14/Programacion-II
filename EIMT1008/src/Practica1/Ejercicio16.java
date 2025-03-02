package Practica1;

import java.util.Arrays;

public class Ejercicio16 {
    public static void main(String[] args){
        prueba(new double[]{-5,5,-4,-3}, 1, 3);
        prueba(new double[]{-5.4,5,-4.5,-3}, 1, 3);
        prueba(new double[]{5,5,-4,-3}, 1, 2);
        prueba(new double[]{-5,5,-4,-3}, 2, 1);
        prueba(new double[]{-5,5,-4,-3}, 5, 0);
    }

    public static int contarOlasDeFrio(double[] temperaturasMax, int diasConsecutivos){
        int olasDeFrio = 0;
        int contadorDiasFrios = 0;
        for (int i=0; i < temperaturasMax.length; i++){
            if(temperaturasMax[i] < 0) {
                contadorDiasFrios++;
                if (contadorDiasFrios == diasConsecutivos) {
                    olasDeFrio++;
                    contadorDiasFrios = 0;
                }
            }
        }
        return olasDeFrio;
    }

    public static void prueba(double[] temperaturasMax, int diasConsecutivos, int esperado){
        int resultado = contarOlasDeFrio(temperaturasMax, diasConsecutivos);
        System.out.format("Prueba con %s y %s dias consecutivos --> %s ", Arrays.toString(temperaturasMax), diasConsecutivos, resultado);
        if (resultado == esperado){
            System.out.println(": ok");
        }else{
            System.out.format(": ERROR, valor esperado : %s", esperado);
        }
    }
}
