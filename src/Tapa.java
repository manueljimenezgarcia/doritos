package src;

public class Tapa {

	public static final String JAMON = "jamon";
	
	public static final String ACEITUNAS = "aceitunas";
	
	public static final String PATATAS = "patatas";
	
	public static final String BOQUERONES = "boquerones";
	
	public String dameTapa(int numeroRonda){
	
		if (numeroRonda == 1) {
			return PATATAS;
		} else if (numeroRonda == 2) {
			return ACEITUNAS;
		} else if (numeroRonda == 3) {
			return BOQUERONES;
		} else if (numeroRonda > 3) {
			return JAMON;
		}
		return "a la puta calle!!!";
	}	
}
