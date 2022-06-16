package dominio;

public class Director extends Persona {

	private String patenteCorporativa;

	public Director(Integer dni, String nombre, String patenteCorporativa) {
		super(dni, nombre);
		setDni(dni);
		setNombre(nombre);
		this.patenteCorporativa = patenteCorporativa;
		// TODO Auto-generated constructor stub
	}

	public String getPatenteCorporativa() {
		return patenteCorporativa;
	}

	public void setPatenteCorporativa(String patenteCorporativa) {
		this.patenteCorporativa = patenteCorporativa;
	}

}
