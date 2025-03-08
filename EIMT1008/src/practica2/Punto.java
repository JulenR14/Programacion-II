package practica2;

import java.util.Locale;
import java.util.Objects;

public class Punto {
    //Parametros que forman el punto
    private double x;
    private double y;

    //Contructores
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    //geters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    //Metodo que desplaza un punto en desplazamiento x e desplazamiento y
    public Punto desplazar(double desplazamiendoX, double desplazamientoY){
        return new Punto(this.x + desplazamiendoX, this.y + desplazamientoY);
    }

    //Metodo que devuelve la distancia que hay entre este punto y el punto que se le pasa por parametros
    public double distancia(Punto otroPunto){
        return Math.sqrt(Math.pow(otroPunto.getX() - this.x,2) + Math.pow(otroPunto.getY() - this.y,2));
    }

    public String toString(){
        return String.format(Locale.US, "%.2f, %.2f", x, y);
    }

    public boolean equals(Object otroObjeto){
        boolean resultado = false;
        if (otroObjeto instanceof Punto){
            if(((Punto) otroObjeto).getX() == this.x && ((Punto) otroObjeto).getY() == this.y){
                resultado = true;
            }
        }
        return resultado;
    }
}
