package Practica1;

import java.util.Scanner;

/**
 * Escribe un programa que lea un numero entero, n, y escriba su dobe factorial, n!!
 */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long numero;
        Long factorial;

        System.out.print("Introduce un numero entero: ");
        numero = sc.nextLong();
        factorial = numero;
        if (numero != 0 && numero !=1){
            for (Long i = numero-2; i > 0; i = i - 2) {
                factorial = factorial * i;
            }
        }else{
            factorial = 1L;
        }
        System.out.println(numero + "!! = " + factorial);
    }
}

