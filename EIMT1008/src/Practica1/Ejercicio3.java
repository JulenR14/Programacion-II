package Practica1;

import java.util.Scanner;

/**
 * Escribe un programa que lea un número entero y escriba "Es primo" o "No es primo", según corresponda.
 */
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();
        boolean primo = true;

        int divisor = numero -1;
        while (divisor>1 && primo){
            if (numero%divisor==0){
                primo = false;
            }
            divisor--;
        }

        if (primo){
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo.");
        }
    }
}
