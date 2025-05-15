package Practica3.Ejercicio2;

public class ListaCadenasEnlaceSimple implements ListaCadenas{

    private class Nodo{
        public String cadena;
        public Nodo siguiente;

        public Nodo(Nodo siguiente, String cadena){
            this.siguiente = siguiente;
            this.cadena = cadena;
        }

        public String toString(){
            return cadena;
        }
    }

    private int talla;
    private Nodo primero;

    public ListaCadenasEnlaceSimple(){
        primero = null;
        talla = 0;
    }

    @Override
    public boolean add(String s) {
        if (primero == null){
            primero = new Nodo(null, s);
        }else{
            Nodo ultimo = primero;
            for(Nodo cont = primero; cont != null; cont=cont.siguiente){
                ultimo = cont;
            }
            ultimo.siguiente = new Nodo(null,s);
        }
        talla++;
        return true;
    }

    @Override
    public void add(int i, String s) throws IndexOutOfBoundsException{
        if (i < 0 || i > size()){
            throw  new IndexOutOfBoundsException();
        }
        Nodo nuevo;
        boolean agregado = false;
        int contadorPosiciones = 0;
        for(Nodo cont = primero; cont != null && !agregado; cont=cont.siguiente){
            if(i==0){
                nuevo = new Nodo(primero, s);
                primero = nuevo;
                agregado = true;
            }else if (i-1 == contadorPosiciones){
                nuevo = new Nodo(cont.siguiente, s);
                cont.siguiente = nuevo;
                agregado = true;
            }
            contadorPosiciones++;
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public String get(int i) {
        return "";
    }

    @Override
    public int indexOf(String s) {
        return 0;
    }

    @Override
    public int lastIndexOf(String s) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String remove(int i) {
        return "";
    }

    @Override
    public boolean remove(String s) {
        return false;
    }

    @Override
    public String set(int i, String s) {
        return "";
    }

    @Override
    public int size() {
        return talla;
    }

    public String toString(){
        String cadena = "[";
        for(Nodo cont = primero; cont != null; cont = cont.siguiente){
            if(cont.siguiente != null){
                cadena += cont.cadena + ", ";
            }else{
                cadena += cont.cadena;
            }
        }
        cadena += "]";
        return cadena;
    }
}
