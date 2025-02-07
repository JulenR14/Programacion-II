package Practica1;

import java.util.Scanner;

/**
Escribe un programa que lea un número entero, n, y escriba su primorial, n#, el primorial de n se define como
 el producto de todos los numeros primos menores o iguales a n.
 */
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();
        Long primorial = 1L;

        for (int i=2; i<=numero; i++) {

            boolean primo = true;
            int divisor = i-1;

            while(divisor>1 && primo){
                if(i%divisor == 0){
                    primo = false;
                }
                divisor--;
            }
            if(primo){
                primorial *= i;
            }
        }
        System.out.println(numero + "# = " + primorial);
    }
}
