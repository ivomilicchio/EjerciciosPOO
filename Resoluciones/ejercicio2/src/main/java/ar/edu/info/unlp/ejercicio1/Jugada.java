package ar.edu.info.unlp.ejercicio1;

public interface Jugada {
	
	public String jugarContra(Jugada jugada);
	public String contraPiedra();
	public String contraPapel();
	public String contraTijera();
	public String contraLagarto();
	public String contraSpock();

}