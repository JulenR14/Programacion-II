package practica0;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¾Límite? ");
        int limite = entrada.nextInt();
        int suma = 0;
        int numero = 1;
        while (numero <= limite) {
            suma += numero;
            numero++;
        }
        System.out.println("Suma: " + suma);
        entrada.close();
    }
}
