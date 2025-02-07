package Practica1;

import java.util.Scanner;

/**
 * Escribe un programa que lea un numero entero, n, y escriba todos los numeros primos menores que n
 */
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        for (int i=2; i<numero; i++) {

            boolean primo = true;
            int divisor = i-1;

            while(divisor>1 && primo){
                if(i%divisor == 0){
                    primo = false;
                }
                divisor--;
            }
            if(primo){
                System.out.print(i + " ");
            }
        }
    }
}
