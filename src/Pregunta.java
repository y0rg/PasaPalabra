
public class Pregunta {

	private String pregunta;
	private String respuesta;
	private char estado; // representa si una pregunta esta respondida 'B'ien , 'M'al o 'P'asapalabra
	private char letra;

	public Pregunta(String pregunta, String respuesta, char letra) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.letra = letra;
		this.estado = 'P';
	}

	public boolean responder(String intento) {
		boolean correcto = false;
		if (intento.equalsIgnoreCase(respuesta)) {
			correcto = true;
			estado = 'B';
		} else {
			estado = 'M';
		}
		return correcto;
	}

	public String toString() {
		return "Con la letra " + letra + ": " + pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public char getEstado() {
		return estado;
	}

	public char getLetra() {
		return letra;
	}

}
