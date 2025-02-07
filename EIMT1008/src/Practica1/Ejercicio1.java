package Practica1;

import java.util.Scanner;

/**
 * Escribe un programa que lea un número entero n y escriba su factorial n!
 */
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long numero;
        Long factorial = 1L;

        System.out.print("Introduce un numero entero: ");
        numero = sc.nextLong();

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println(numero + "! = " + factorial);
    }
}
