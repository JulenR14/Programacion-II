package practica2.Ejercicios1234;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Restaurante {
    private String nombre;
    private Punto posicion;
    private int valoracion;

    public Restaurante(String nombre, Punto posicion, int valoracion){
        this.nombre = nombre;
        this.posicion = posicion;
        this.valoracion = valoracion;
    }

    //Geters
    public String getNombre() {
        return nombre;
    }
    public Punto getPunto() {
        return posicion;
    }
    public int getValoracion() {
        return valoracion;
    }

    //Metodo que devuelve la distancia entre el restaurante y el punto pasado por parametro
    public double distancia(Punto p){
        return this.posicion.distancia(p);
    }

    public static Restaurante[] leeRestaurantes(String nombreFichero) {
        Restaurante[] restaurantes;
        try{
            Scanner sc = new Scanner(new File(nombreFichero));
            sc.useLocale(Locale.US);
            int cantidadRestaurantes = sc.nextInt();
            restaurantes = new Restaurante[cantidadRestaurantes];
            int contadorRestaurantes = 0;
            while (sc.hasNext()){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int val = sc.nextInt();
                String nombre = sc.next();
                restaurantes[contadorRestaurantes] = new Restaurante(nombre, new Punto(x,y), val);
                contadorRestaurantes++;
            }
        }catch (FileNotFoundException e){
            System.out.println("No se puede leer el fichero ");
            System.err.println(e.getMessage());
            restaurantes = new Restaurante[0];
        }
        return restaurantes;
    }

    public String toString(){
        return "Nombre: " + nombre + " - Posicion: " + posicion.toString() + " - Valoracion " + valoracion;
    }
}
