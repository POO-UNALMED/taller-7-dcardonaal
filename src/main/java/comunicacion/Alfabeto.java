package comunicacion;

public class Alfabeto extends Pictograma{
	private static String[] letras;
	private String interpretacion;
	
	
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	

	public int cantidadLetras() {
		return Alfabeto.letras.length;
		
	}
	
	public String interpretacion() {
		return interpretacion;
		
	}
	
	public String toString() {
		return "a, b, c, d, e, f, g, h, i, j, k, l, m, n, ñ, o, p, q, r, s, t, u, v, w, x, y, z";
	}


	public static String[] getLetras() {
		return letras;
	}


	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}


	public String getInterpretacion() {
		return interpretacion;
	}


	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	
}


