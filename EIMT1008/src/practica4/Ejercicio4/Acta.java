package practica4.Ejercicio4;

import java.util.NoSuchElementException;

public class Acta {
    // Atributos
    private String código; // Código de la asignatura
    private int curso; // Curso académico
    private NotaEstudiante[] notas; // Datos de los estudiantes que hay en el acta
                                    // (ordenados de menor a mayor por DNI)

    // Constructor
    public Acta(String código, int curso, NotaEstudiante[] notas) {
        this.código = código;
        this.curso = curso;
        this.notas = notas;
    }

    // Métodos
    public void calificar(String DNI, double nota) {
        int inicio = 0;
        int fin = notas.length - 1;
        int medio = (fin-inicio)/2;
        boolean encontrado = false;
        while (inicio <= fin){
            if (notas[medio].getDNI().compareTo(DNI) == 0) {
                notas[medio].setNota(nota);
                encontrado = true;
                break;
            }else if(notas[medio].getDNI().compareTo(DNI) < 0){
                inicio = medio+1;
            }else{
                fin = medio-1;
            }
            medio = inicio + (fin-inicio)/2;
        }
        if (!encontrado) {
            throw new NoSuchElementException();
        }
    }

    public void enviarSMS(String[] vectorDNI) {
        int posicionSuscritos = 0;
        int posicionActa = 0;
        int comprobación;
        while (posicionActa < notas.length){
            comprobación = notas[posicionActa].getDNI().compareTo(vectorDNI[posicionSuscritos]);
            if(comprobación == 0 && (notas[posicionActa].getPresentado())){
                SMS.enviar(notas[posicionActa].getDNI(), notas[posicionActa].getNota());
                posicionActa++;
                posicionSuscritos++;
            }else if(comprobación > 0){
                posicionSuscritos++;
            }else{
                posicionActa++;
            }
        }
    }

    public Acta siguienteConvocatoria() {
        int alumnosNuevaConvocatoria = 0;
        for(int i = 0; i <notas.length;i++){
            if(!notas[i].getPresentado() || notas[i].getNota() < 5){
                alumnosNuevaConvocatoria++;
            }
        }
        int contadorNuevosEstudiantes = 0;
        NotaEstudiante[] nuevosEstudiantes = new NotaEstudiante[alumnosNuevaConvocatoria];
        for(int i = 0; i < notas.length; i++){
            if(!notas[i].getPresentado()){
                nuevosEstudiantes[contadorNuevosEstudiantes] = notas[i];
                contadorNuevosEstudiantes++;
            }else if(notas[i].getNota() < 5){
                nuevosEstudiantes[contadorNuevosEstudiantes] = new NotaEstudiante(notas[i].getDNI(), notas[i].getConvocatoria()+1);
                contadorNuevosEstudiantes++;
            }
        }
        return new Acta(this.código, this.curso, nuevosEstudiantes); // Completar
    }

    public String toString() {
        String resultado = String.format("%s -> %d%n", código, curso);
        for (NotaEstudiante n: notas)
            resultado += n;
        return resultado;
    }
}
