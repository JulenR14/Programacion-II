package Practica3.Ejercicio2;

public class ListaCadenasEnlaceSimple implements ListaCadenas{

    private class Nodo{
        public String cadena;
        public Nodo siguiente;

        public Nodo(Nodo siguiente, String cadena){
            this.siguiente = siguiente;
            this.cadena = cadena;
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
        Nodo anterior = null;
        Nodo aux = primero;
        int contador = 0;
        boolean agregado = false;
        while (contador < size() && !agregado){
            if (i == 0){
                nuevo = new Nodo(primero,s);
                primero = nuevo;
            }

            contador++;
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
}
