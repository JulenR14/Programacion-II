package Practica1;

public class Ejercicio23 {
    public static void main(String[] args){
        double[][] temperaturas1 = {
                {-5, -3, -6, -1, 2, -7, -8},  // 1900
                {1, -2, -3, -4, -5, -6, -7},  // 1901
                {-1, -2, -3, -4, 1, 2, 3}     // 1902
        };

        prueba(temperaturas1, 3, 1901);
        prueba(temperaturas1, 5, 1901);
        prueba(temperaturas1, 7, -1);

        double[][] temperaturas2 = {
                {-10, -15, -20, -5, -10, -15},   // 1900
                {-5, -6, -7, -8, -9, -10},    // 1901
                {-3, -4, -5, -1, -2, -3}         // 1902
        };

        prueba(temperaturas2, 2, 1902);
        prueba(temperaturas2, 4, 1902);
        prueba(temperaturas2, 6, 1902);
    }

    public static int masOlasDeFrio(double[][] matriz, int nDias){
        int origenYear = 1900;
        int year = -1;
        int ultimaCantidadFrio = 0;

        for(int i = 0; i < matriz.length; i++){
            int cantidad = contarOlasDeFrio(matriz[i], nDias);
            if ((ultimaCantidadFrio <= cantidad) && (cantidad!=0)){
                year = origenYear + i;
                ultimaCantidadFrio = cantidad;
            }
        }

        return year;
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

    public static void prueba(double[][] temperaturas, int n, int esperado) {
        int resultado = masOlasDeFrio(temperaturas, n);
        System.out.format("Prueba con n=%d --> %d", n, resultado);
        if (resultado == esperado) {
            System.out.println(": ok");
        } else {
            System.out.format(": ERROR, valor esperado : %d\n", esperado);
        }
    }
}
