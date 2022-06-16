package dominio;

import java.util.HashSet;

public class Empresa {
	
	private String nombre;
	private HashSet<Persona> personas;
	private Integer cantidadPersonasVinculadas;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.personas = new HashSet<>();
		this.cantidadPersonasVinculadas = 0;
	}

	public void vincularPersona(Persona persona) {
		// TODO Auto-generated method stub
		if(this.personas.add(persona))
			cantidadPersonasVinculadas++;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadPersonasVinculadas() {
		return cantidadPersonasVinculadas;
	}

	public void setCantidadPersonasVinculadas(Integer cantidadPersonasVinculadas) {
		this.cantidadPersonasVinculadas = cantidadPersonasVinculadas;
	}

}
