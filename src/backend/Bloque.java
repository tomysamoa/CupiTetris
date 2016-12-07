package backend;

public interface Bloque {

	
	public final static int ELE = 0;
	public final static int LEL = 1;
	public final static int ZETA = 2;
	public final static int ESE = 3;
	public final static int TE = 4;
	public final static int RAYA = 5;
	public final static int CUBO = 6;
	public final static int VACIO = 7;
	
	public int darColor();
	
	public void tirar();
}
