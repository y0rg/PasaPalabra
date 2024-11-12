

import java.util.Scanner;

/*
@author Jorge Tarancon
Juego de PasaPalabra que iremos actualizando durante el curso
con los nuevos contenidos
@version 1.0
*/

public class Jugar {

	private static final String PREGUNTA_A = "Animal marino con forma de serpiente";
	private static final String RESPUESTA_A = "Anguila";

	private static final String PREGUNTA_E = "Animal africano de grandes orejas";
	private static final String RESPUESTA_E = "Elefante";

	private static final String PREGUNTA_I = "Animal reptiliano paracido a un lagarto";
	private static final String RESPUESTA_I = "Iguana";

	private static final String PREGUNTA_O = "Animal que vive en el bosque o en el hielo";
	private static final String RESPUESTA_O = "Oso";

	private static final String PREGUNTA_U = "Animal volador de la familia de las corvidaes";
	private static final String RESPUESTA_U = "Urraca";
	
	private static final int NUM_LETRAS = 5;
	
	private static final long LIMITE_TIEMPO = 1000000000 * 30; //30 segundos

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		boolean empezar = false;
		String res;
		int aciertos = 0;
		int fallos = 0;
		int blancos = 0;

		System.out.println("Bienvenido al PasaPalabra Kursaal edition");
		do {
			System.out.println("¿Esta preparado para iniciar el concurso? S / N");
			res = teclado.nextLine();
			if (res.equalsIgnoreCase("S")) {
				empezar = true;
			}
		} while (!empezar);

		System.out.println("Vamos al lio!!!");
		//Empezamos a contar el tiempo
		long tiempoInicio = System.nanoTime();

		// Inicia el bloque de una preguna
		System.out.println("________________________________");
		System.out.println("Empieza por A: " + PREGUNTA_A);
		res = teclado.nextLine();
		if (res.equals("")) {
			blancos++;
			System.out.println("Pasa palabra");
		} else {
			if (res.equalsIgnoreCase(RESPUESTA_A)) {
				aciertos++;
				System.out.println("Coooorrecto!");
			} else {
				fallos++;
				System.out.println("Noooo! La respuesta era: " + RESPUESTA_A);
			}
		}
		// FInaliza el bloque de una pregunta

		// Inicia el bloque de una preguna
		System.out.println("________________________________");
		System.out.println("Empieza por E: " + PREGUNTA_E);
		res = teclado.nextLine();
		if (res.equals("")) {
			blancos++;
			System.out.println("Pasa palabra");
		} else {
			if (res.equalsIgnoreCase(RESPUESTA_E)) {
				aciertos++;
				System.out.println("Coooorrecto!");
			} else {
				fallos++;
				System.out.println("Noooo! La respuesta era: " + RESPUESTA_E);
			}
		}
		// FInaliza el bloque de una pregunta

		// Inicia el bloque de una preguna
		System.out.println("________________________________");
		System.out.println("Empieza por I: " + PREGUNTA_I);
		res = teclado.nextLine();
		if (res.equals("")) {
			blancos++;
			System.out.println("Pasa palabra");
		} else {
			if (res.equalsIgnoreCase(RESPUESTA_I)) {
				aciertos++;
				System.out.println("Coooorrecto!");
			} else {
				fallos++;
				System.out.println("Noooo! La respuesta era: " + RESPUESTA_I);
			}
		}
		// FInaliza el bloque de una pregunta

		// Inicia el bloque de una preguna
		System.out.println("________________________________");
		System.out.println("Empieza por O: " + PREGUNTA_O);
		res = teclado.nextLine();
		if (res.equals("")) {
			blancos++;
			System.out.println("Pasa palabra");
		} else {
			if (res.equalsIgnoreCase(RESPUESTA_O)) {
				aciertos++;
				System.out.println("Coooorrecto!");
			} else {
				fallos++;
				System.out.println("Noooo! La respuesta era: " + RESPUESTA_O);
			}
		}
		// FInaliza el bloque de una pregunta

		// Inicia el bloque de una preguna
		System.out.println("________________________________");
		System.out.println("Empieza por U: " + PREGUNTA_U);
		res = teclado.nextLine();
		if (res.equals("")) {
			blancos++;
			System.out.println("Pasa palabra");
		} else {
			if (res.equalsIgnoreCase(RESPUESTA_U)) {
				aciertos++;
				System.out.println("Coooorrecto!");
			} else {
				fallos++;
				System.out.println("Noooo! La respuesta era: " + RESPUESTA_U);
			}
		}
		// FInaliza el bloque de una pregunta
		
		long tiempoFin = System.nanoTime();
		boolean aTiempo = true;
		if(tiempoFin - tiempoInicio < LIMITE_TIEMPO) {
			System.out.println("No completaste el rosco a tiempo =(");
			aTiempo = false;
		}
			

		// Resume de resultados
		System.out.println("Aciertos: " + aciertos);
		System.out.println("Fallos: " + fallos);
		System.out.println("Blancos: " + blancos);
		if(aciertos == NUM_LETRAS && aTiempo) {
			System.out.println("HAS GANADA EL BOTE DE 2.334.424€ !!!!!!!");
		}
	}

}
