package Paciente;

public class Paciente {
	private String nombre;
	private String estado;
	
	public Paciente(String nombre, String estado) {
		this.nombre = nombre;
		this.estado = estado;
	}
	
	@Override
	public int compareTo(Object o){
		return 1;
	}
}
