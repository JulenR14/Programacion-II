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
                talla++;
            }else if (i-1 == contadorPosiciones){
                nuevo = new Nodo(cont.siguiente, s);
                cont.siguiente = nuevo;
                agregado = true;
                talla++;
            }
            contadorPosiciones++;
        }
    }

    @Override
    public void clear() {
        primero = null;
        talla = 0;
    }

    @Override
    public String get(int i) throws IndexOutOfBoundsException{
        String cadena = "";
        if(i >= 0 && i < size()){
            Nodo aux = primero;
            for(int cont = 0; cont < i; cont++){
                aux = aux.siguiente;
            }
            cadena = aux.cadena;
        }else{
            throw new IndexOutOfBoundsException();
        }
        return cadena;
    }

    @Override
    public int indexOf(String s) {
        int posicion=-1;
        int contadorPosiciones=0;
        for(Nodo aux = primero; aux != null && posicion == -1; aux=aux.siguiente){
            if(aux.cadena.equals(s)){
                posicion = contadorPosiciones;
            }
            contadorPosiciones++;
        }
        return posicion;
    }

    @Override
    public int lastIndexOf(String s) {
        int posicion=-1;
        int contadorPosiciones=0;
        for(Nodo aux = primero; aux != null; aux = aux.siguiente){
            if(aux.cadena.equals(s)){
                posicion = contadorPosiciones;
            }
            contadorPosiciones++;
        }
        return posicion;
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
