package practica0;

import java.util.Scanner;

public class SumarHasta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¾Límite? ");
        int limite = entrada.nextInt();
        int suma = sumarHasta(limite);
        System.out.println("Suma: " + suma);
        entrada.close();
    }

    private static int sumarHasta(int limite) {
        int suma = 0;
        int numero = 1;
        while (numero <= limite) {
            suma += numero;
            numero++;
        }
        return suma;
    }
}
