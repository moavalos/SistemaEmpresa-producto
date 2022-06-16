package dominio;

public class Director {

	private Integer dni;
	private String nombre;
	private String patenteCorporativa;

	public Director(Integer dni, String nombre, String patenteCorporativa) {
		// TODO Auto-generated constructor stub
		this.dni = dni;
		this.nombre = nombre;
		this.patenteCorporativa = patenteCorporativa;
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

	public String getPatenteCorporativa() {
		return patenteCorporativa;
	}

	public void setPatenteCorporativa(String patenteCorporativa) {
		this.patenteCorporativa = patenteCorporativa;
	}

}
