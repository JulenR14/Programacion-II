package Practica1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        int numeroMasDivisores = 0;
        int cantidadDivisoresUltimoNum = 0;
        for(int i = 0; i < numero; i++){
            int cantDivisores = contarDivisores(i);
            if (cantDivisores>=cantidadDivisoresUltimoNum && i > numeroMasDivisores) {
                cantidadDivisoresUltimoNum = cantDivisores;
                numeroMasDivisores = i;
            }
        }
        System.out.println("El numero con mas divisores es " + numeroMasDivisores + "( " + cantidadDivisoresUltimoNum + " divisores )");
    }

    public static int contarDivisores(int numero){
        int contadorDivisores = 0;
        for (int j=1;j<=numero; j++) {
            if (numero%j==0){
                contadorDivisores++;
            }
        }
        return contadorDivisores;
    }
}
