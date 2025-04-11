package practica2.Ejercicio8;

import java.util.Arrays;

public class main{
    public static void main(String[] args) {

        Tarea tarea = new Tarea(Fecha.hoy(), "Examen");
        Tarea tarea2 = new Tarea(Fecha.hoy().díaSiguiente(), "Programacion");
        Tarea tarea3 = new Tarea(Fecha.hoy(), "Mates");
        Tarea tarea4 = new Tarea(Fecha.hoy(), "Arqui");
        Tarea tarea5 = new Tarea(Fecha.hoy(), "Fisica");

        Agenda agenda = new Agenda();

        agenda.añadir(tarea);
        agenda.añadir(tarea2);
        agenda.añadir(tarea3);
        agenda.añadir(tarea4);
        agenda.añadir(tarea5);

        System.out.println(agenda);

        System.out.println(Arrays.toString(agenda.consultar(Fecha.hoy())));
    }
}
