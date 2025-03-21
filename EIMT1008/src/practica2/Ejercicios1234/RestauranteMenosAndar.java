package practica2.Ejercicios1234;

import java.util.Scanner;

public class RestauranteMenosAndar {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero de restaurantes: ");
        String nombreFichero = teclado.next();
        Restaurante[] restaurantes = Restaurante.leeRestaurantes(nombreFichero);

        System.out.println("Indique su posición actual");
        System.out.print("Coordenada X: ");
        double x = teclado.nextDouble();
        System.out.print("Coordenada Y: ");
        double y = teclado.nextDouble();

        Restaurante restaurante = restauranteMejorValorado(restaurantes, new Punto(x, y), 3);
        if (restaurante != null){
            System.out.print("El restaurante más cercano a su posición es " + restaurante.getNombre() + " y tiene una valoracion de " + restaurante.getValoracion());
            System.out.println(", situado en el punto " + restaurante.getPosicion());
        }
    }

    public static Restaurante restauranteMejorValorado(Restaurante[] v, Punto p, double d){
        Restaurante restaurante = null;
        int ultimaValoracion = 0;
        for (Restaurante rest : v){
            if(rest.distancia(p) <= d){
                if(rest.getValoracion() > ultimaValoracion){
                    restaurante = rest;
                }
            }
        }
        return restaurante;
    }
}
