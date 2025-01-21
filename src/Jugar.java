

import java.util.Scanner;

/*
@author Jorge Tarancon
Juego de PasaPalabra que iremos actualizando durante el curso
con los nuevos contenidos
@version 1.0
*/

public class Jugar {

	
	private static final int NUM_LETRAS = 5;
	
	private static final long LIMITE_TIEMPO = 1000000000 * 30; //30 segundos

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		boolean empezar = false;
		String res;
		int aciertos = 0;
		int fallos = 0;

		Pregunta[] preguntas = new Pregunta[PreguntasYRespuestas.getLongitud()];
		for (int i = 0; i < preguntas.length; i++) {
			preguntas[i] = new Pregunta(PreguntasYRespuestas.getPreguntas()[i], 
					PreguntasYRespuestas.getRespuestas()[i], 
					PreguntasYRespuestas.getVocales().charAt(i));
		}
		
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

		
		boolean todasContestadas = false;
		int contador = 0;
		
		while (!todasContestadas) { //TODO comprobar también el tiempo para terminar
			// Inicia el bloque de una preguna
			System.out.println("________________________________");
			System.out.println("Empieza por "+preguntas[contador].getLetra()+": "+preguntas[contador].getPregunta() );
			res = teclado.nextLine();
			if (res.equals("")) { // res.isBlank()
				System.out.println("Pasa palabra");
			} else {
				if (preguntas[contador].responder(res)) {			
					System.out.println("Coooorrecto!");
				} else {
					System.out.println("Noooo! La respuesta era: " + preguntas[contador].getRespuesta());
				}
			}
			// FInaliza el bloque de una pregunta
			
			//TODO comprobar si todas las preguntas se han respondido para salir del bucle.
		}
		
		
		
		long tiempoFin = System.nanoTime();
		boolean aTiempo = true;
		if(tiempoFin - tiempoInicio < LIMITE_TIEMPO) {
			System.out.println("No completaste el rosco a tiempo =(");
			aTiempo = false;
		}
			

		// Resume de resultados
		System.out.println("Aciertos: " + aciertos);
		System.out.println("Fallos: " + fallos);
// FIXME		System.out.println("Blancos: " + blancos);
		if(aciertos == NUM_LETRAS && aTiempo) {
			System.out.println("HAS GANADA EL BOTE DE 2.334.424€ !!!!!!!");
		}
	}

}
