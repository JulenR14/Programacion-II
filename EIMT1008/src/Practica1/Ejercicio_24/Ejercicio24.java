package Practica1.Ejercicio_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] elementos = {"tierra", "fuego", "lava", "aire", "piedra", "agua", "arena", "desierto", "cristal", "reloj_de_arena"};
        String archivoCombinaciones = "./src/Practica1/Ejercicio_24/alquimia10.txt";

        int[][] matrizCombinaciones = crearMatrizCombinaciones(elementos, archivoCombinaciones);
        for (int i = 0; i < matrizCombinaciones.length; i++){
            System.out.println(Arrays.toString(matrizCombinaciones[i]));
        }
    }

    public static int[][] crearMatrizCombinaciones(String[] elementos, String nombreFichero) throws FileNotFoundException {
        // Declaración de la matriz de combinaciones.
        // Esta matriz será de tamaño NxN, donde N es el número de elementos.
        // Cada celda [i][j] representará la combinación de elementos[i] y elementos[j].
        int[][] matrizCombinaciones = new int[elementos.length][elementos.length];

        // Bucle externo para recorrer todas las filas de la matriz.
        for (int i = 0; i < matrizCombinaciones.length; i++){
            // Obtiene el nombre del elemento correspondiente al índice 'i'.
            String elemento1 = elementos[i];

            // Bucle interno para recorrer todas las columnas de la matriz.
            for (int j = 0; j < matrizCombinaciones[i].length; j++){
                // Obtiene el nombre del elemento correspondiente al índice 'j'.
                String elemento2 = elementos[j];

                // Inicialización de variables para controlar la combinación.
                // 'hayCombinacion' será verdadero si se encuentra una combinación válida.
                boolean hayCombinacion = false;
                // 'inidiceElementoCombinacion' almacenará el índice del elemento resultante de la combinación.
                // Se inicializa a -1, indicando que aún no se ha encontrado.
                int inidiceElementoCombinacion = -1;

                // Abre un Scanner para leer el archivo de combinaciones.
                // 'nombreFichero' es el nombre del archivo que contiene las combinaciones.
                Scanner sc = new Scanner(new File(nombreFichero));

                // Bucle que lee el archivo línea por línea hasta encontrar una combinación o llegar al final del archivo.
                while (sc.hasNext() && !hayCombinacion){
                    // Lee la siguiente línea del archivo y la divide en tres partes (elemento1, elemento2, resultado).
                    String[] lineaElementos = new String[]{sc.next(), sc.next(), sc.next()};

                    // Verifica si la línea leída coincide con la combinación de 'elemento1' y 'elemento2'.
                    // La verificación se hace en ambos órdenes (elemento1, elemento2) y (elemento2, elemento1)
                    // debido a que la combinación es simétrica.
                    if (elemento1.equals(lineaElementos[0]) && elemento2.equals(lineaElementos[1]) ||
                            elemento2.equals(lineaElementos[0]) && elemento1.equals(lineaElementos[1])){
                        // Si se encuentra una combinación válida, 'hayCombinacion' se establece a verdadero.
                        hayCombinacion = true;

                        // Inicializa un contador para buscar el índice del elemento resultante.
                        int cont = 0;

                        // Bucle que busca el índice del elemento resultante en el vector 'elementos'.
                        while (cont < elementos.length && inidiceElementoCombinacion == -1){
                            // Verifica si el elemento en 'lineaElementos[2]' (el resultado) coincide con 'elementos[cont]'.
                            if(elementos[cont].equals(lineaElementos[2])){
                                // Si coinciden, se guarda el índice en 'inidiceElementoCombinacion'.
                                inidiceElementoCombinacion = cont;
                            }
                            // Incrementa el contador.
                            cont++;
                        }
                    }
                }
                // Cierra el Scanner para liberar los recursos.
                sc.close();

                // Guarda el índice del elemento resultante en la matriz 'matrizCombinaciones[i][j]'.
                // Si no se encontró combinación, 'inidiceElementoCombinacion' seguirá siendo -1.
                matrizCombinaciones[i][j] = inidiceElementoCombinacion;
            }
        }

        // Retorna la matriz de combinaciones.
        return matrizCombinaciones;
    }
}


