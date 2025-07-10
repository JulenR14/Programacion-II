import java.io.FileNotFoundException;

import static practica4.Ejercicio1.metodosDNI.*;

public static void main(String[] args) throws FileNotFoundException {
		String[] dnisCenso = crearVectorDni("Datos/dniCenso.txt");
		String[] dnisClientes = crearVectorDni("Datos/dniClientes.txt");

		long tiempoInicio = System.currentTimeMillis();
		int coincidencias = contarCoincidencias(dnisCenso, dnisClientes);
		long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio;

		System.out.println("He encontrado " + coincidencias
				+ " coincidencias (empleando " + tiempoTranscurrido
				+ " milisegundos)");

	}
