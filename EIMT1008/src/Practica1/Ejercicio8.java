package Practica1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        for (int i=2; i<numero; i++) {
            if(esPrimo(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean esPrimo(int numero){
        boolean primo = true;
        int divisor = numero -1;
        while (divisor>1 && primo){
            if (numero%divisor==0){
                primo = false;
            }
            divisor--;
        }
        return primo;
    }
}
