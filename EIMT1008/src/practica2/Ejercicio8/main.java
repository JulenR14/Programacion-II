package practica2.Ejercicio8;

import practica2.Ejercicio56.ExcepcionFechaNoValida;

import java.util.Arrays;

public class main{
    public static void main(String[] args) throws ExcepcionFechaNoValida {
        Tarea tareaMuyAnterior = new Tarea(new Fecha(10,4,2025), "Primera ev");
        Tarea tareasAnterior = new Tarea(new Fecha(11,4,2025), "Segunda ev");
        Tarea tarea = new Tarea(Fecha.hoy(), "Examen");
        Tarea tarea2 = new Tarea(Fecha.hoy().díaSiguiente(), "Programacion");
        Tarea tarea3 = new Tarea(Fecha.hoy(), "Mates");
        Tarea tarea4 = new Tarea(Fecha.hoy(), "Arqui");
        Tarea tarea5 = new Tarea(Fecha.hoy(), "Fisica");

        Agenda agenda = new Agenda();

        agenda.añadir(tareaMuyAnterior);
        agenda.añadir(tareasAnterior);
        agenda.añadir(tarea);
        agenda.añadir(tarea2);
        agenda.añadir(tarea5);

        System.out.println(agenda);

        System.out.println(Arrays.toString(agenda.consultar(Fecha.hoy())));

        System.out.println("Borrar los elementos anterior a hoy : " + Fecha.hoy().díaSiguiente());
        agenda.borrarPasadas(Fecha.hoy().díaSiguiente());
        System.out.println(agenda);
    }
}
