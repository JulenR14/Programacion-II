package Practica1;

import java.util.Scanner;

/*
Escribe un metodo estatico, esPrimo, que tenga como parametro un numero entero y devuelva true cuando ese numero sea primo y false cuando no lo sea
 */
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();
        if(esPrimo(numero)){
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo.");
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
