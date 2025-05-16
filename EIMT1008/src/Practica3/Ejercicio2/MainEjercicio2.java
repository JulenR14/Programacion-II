package Practica3.Ejercicio2;

import java.awt.*;

public class MainEjercicio2 {
    public static void main(String[] args) {
        ListaCadenasEnlaceSimple lista = new ListaCadenasEnlaceSimple();

        System.out.println("Lista vacía :");
        System.out.println(lista);

        lista.add("Julen");
        lista.add("Marcos");
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Alex");

        System.out.println("Se ha agregad nombres a la lista");
        System.out.println(lista);

        lista.add(2, "Marta");
        System.out.println("--------------------------------------------------");
        System.out.println("Se agrega Marta en la posicion 2.");
        System.out.println(lista);

        lista.add(0, "Pedro");
        System.out.println("--------------------------------------------------");
        System.out.println("Se agrega Pedro en la posicion 0.");
        System.out.println(lista);

        System.out.println("--------------------------------------------------");
        System.out.println("Se agrega Pedro en la posicion 15.");
        try {
            lista.add(15, "Maria");
            System.out.println(lista);
        } catch (Exception e) {
            System.out.println("Esta posición no existe");
        }

    }
}