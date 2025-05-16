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
        System.out.println("Talla : " + lista.size());

        lista.add(2, "Marta");
        System.out.println("--------------------------------------------------");
        System.out.println("Se agrega Marta en la posicion 2.");
        System.out.println(lista);
        System.out.println("Talla : " + lista.size());

        lista.add(0, "Pedro");
        System.out.println("--------------------------------------------------");
        System.out.println("Se agrega Pedro en la posicion 0.");
        System.out.println(lista);
        System.out.println("Talla : " + lista.size());

        System.out.println("--------------------------------------------------");
        System.out.println("Se agrega Pedro en la posicion 15.");
        try {
            lista.add(15, "Maria");
            System.out.println(lista);
            System.out.println("Talla : " + lista.size());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Esta posición no existe");
        }

        /*System.out.println("--------------------------------------------------");
        System.out.println("Se limpia la lista.");
        lista.clear();
        System.out.println(lista);
        System.out.println("Talla : " + lista.size());*/

        System.out.println("--------------------------------------------------");
        System.out.println("Obtenemos la cadena de la posicion 0, 3 y 6.");
        System.out.println("Posicion 0 : " + lista.get(0));
        System.out.println("Posicion 3 : " + lista.get(3));
        System.out.println("Posicion 6 : " + lista.get(6));

        try {
            System.out.println("--------------------------------------------------");
            System.out.println("Intentamos acceder a una posición que no existe : 16");
            System.out.println("Posicion 16 : " + lista.get(16));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Esta posicion no existe");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Buscamos posición en la que se encuentra Julen. (Debería de ser posición 1)");
        System.out.println("Julen se encuentra en la posición : " + lista.indexOf("Julen"));

        System.out.println("--------------------------------------------------");
        System.out.println("Buscamos posición en la que se encuentra Francisco. (Debería de ser posición -1, porque no está)");
        System.out.println("Francisco se encuentra en la posición : " + lista.indexOf("Francisco"));

        System.out.println("-------------------------------------------------");
        System.out.println("Se agregan dos nombres más, se repite Julen y Marta.");
        lista.add("Julen");
        lista.add("Marta");
        System.out.println(lista);

        System.out.println("------------------------------------------------");
        System.out.println("Usamos lastIndexOf buscanco Julen : " + lista.lastIndexOf("Julen"));
        System.out.println("Usamos lastIndexOf buscanco Francisco : " + lista.lastIndexOf("Francisco"));


    }
}