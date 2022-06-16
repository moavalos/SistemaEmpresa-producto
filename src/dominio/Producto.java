package dominio;

public class Producto {

	private Integer codigo;
	private String descripcion;
	private Double precio;

	public Producto(Integer codigo, String descripcion, Double precio) {
		// TODO Auto-generated constructor stub
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
