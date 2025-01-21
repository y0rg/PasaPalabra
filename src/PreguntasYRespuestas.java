
public class PreguntasYRespuestas {
	
	static String vocales ="aeiou";
	
	static String[] preguntas = new String[vocales.length()];
	static String[] respuestas = new String[vocales.length()];
	
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
	
	public PreguntasYRespuestas () {
		preguntas[0] = PREGUNTA_A;
		preguntas[1] = PREGUNTA_E;
		preguntas[2] = PREGUNTA_I;
		preguntas[3] = PREGUNTA_O;
		preguntas[4] = PREGUNTA_U;
		
		respuestas[0] = RESPUESTA_A;
		respuestas[1] = RESPUESTA_E;
		respuestas[2] = RESPUESTA_I;
		respuestas[3] = RESPUESTA_O;
		respuestas[4] = RESPUESTA_U;
	}
	

	public static int getLongitud() {
		return vocales.length();
	}
	
	public static String[] getPreguntas() {
		return preguntas;
	}
	
	public static String[] getRespuestas() {
		return respuestas;
	}
	
	public static String getVocales() {
		return vocales;
	}
}
