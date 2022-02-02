package main;

import java.util.Scanner;

import auto.Concesionaria;
import auto.ManejadorArchivos;

public class Main {

	public static void main(String[] args) {
		Concesionaria concesionaria = new Concesionaria();

		concesionaria.agregarTodosAutos(ManejadorArchivos.obtenerAutosDesdeArchivo());
		// XXX La siguiente linea esta FEA. No debería pasarle concesionaria así
		concesionaria.agregarTodasPromociones(ManejadorArchivos.obtenerPromosDesdeArchivo(concesionaria));

		// Listo todas las "atracciones" y las promos con su contenido
		System.out.println(concesionaria.toString());

		// Leer por consola y mostrar por pantalla
		Scanner in = new Scanner(System.in);
		String entradaConsola = in.nextLine();
		System.err.println(entradaConsola);
		in.close();
	}
}
