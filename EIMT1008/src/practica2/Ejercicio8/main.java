package practica2.Ejercicio8;

public class main{
    public static void main(String[] args) {
        Tarea tarea = new Tarea(Fecha.hoy(), "Examen");

        System.out.println(tarea);

        Agenda agenda = new Agenda();
        System.out.println("Posición agregar tarea : " + agenda.posiciónInserción(tarea));
    }
}
