package dominio;

public class Empleado {

	private Integer dni;
	private String nombre;

	public Empleado(Integer dni, String nombre) {
		// TODO Auto-generated constructor stub
		this.dni = dni;
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
