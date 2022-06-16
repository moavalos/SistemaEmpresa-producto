package dominio;

public class Empleado extends Persona {

	public Empleado(Integer dni, String nombre) {
		super(dni, nombre);
		setDni(dni);
		setNombre(nombre);
	}



}
