package dominio;

import java.util.ArrayList;

public class Persona {

	private Integer dni;
	private String nombre;
	private ArrayList<Producto> compras = new ArrayList<>();

	public Persona(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public Boolean agregarCompra(Producto compra) {
		return compras.add(compra);
	}

	public Double getPrecioDelProducto(Producto producto) {
		return producto.getPrecio();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

}
