package Practica1;

import java.util.Scanner;

/**
 * Escribe un programa que lea un numero entero,n, y escriba el mayor numero comprendido entre 1 y n con mas divisores
 */
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        int numeroMasDivisores = 0;
        int cantidadDivisoresUltimoNum = 0;
        for(int i = 0; i < numero; i++){
            int contadorDivisores = 0;
            for (int j=1;j<=i; j++) {
                if (i%j==0){
                    contadorDivisores++;
                }
            }
            if (contadorDivisores>=cantidadDivisoresUltimoNum && i > numeroMasDivisores) {
                cantidadDivisoresUltimoNum = contadorDivisores;
                numeroMasDivisores = i;
            }
        }
        System.out.println("El numero con mas divisores es " + numeroMasDivisores + "( " + cantidadDivisoresUltimoNum + " divisores )");
    }
}
