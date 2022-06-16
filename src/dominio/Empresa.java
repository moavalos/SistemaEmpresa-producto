package dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Empresa {
	
	private String nombre;
	private HashSet<Persona> personas;
	private Integer cantidadPersonasVinculadas;
	private ArrayList<Producto> productos;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.personas = new HashSet<>();
		this.cantidadPersonasVinculadas = 0;
		this.productos = new ArrayList<Producto>();
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

	public Boolean agregarProducto(Producto productoAVender) {
		return productos.add(productoAVender);
		
	}

	public Boolean registrarCompra(Persona comprador, Producto productoAVender) throws ConflictoDeInteresesException, ProductoNoEncontradoException {
		if (comprador instanceof Empleado)
			productoAVender.setPrecio(productoAVender.getPrecio()*0.80);
		else if (comprador instanceof Director)
			throw new ConflictoDeInteresesException();
		else if(!this.productos.contains(productoAVender))
			throw new ProductoNoEncontradoException();
		
		return comprador.agregarCompra(productoAVender);
		
	}

}
