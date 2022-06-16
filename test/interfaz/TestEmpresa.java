package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Cliente;
import dominio.Director;
import dominio.Empleado;
import dominio.Producto;

public class TestEmpresa {

	@Test
	public void crearCliente() {
		Cliente nuevo = new Cliente(1000, "Gonzalo");
		assertEquals((Integer) 1000, nuevo.getDni());
		assertEquals("Gonzalo", nuevo.getNombre());
	}

	@Test
	public void crearEmpleado() {
		Empleado nuevo = new Empleado(1000, "Celeste");
		assertEquals((Integer) 1000, nuevo.getDni());
		assertEquals("Celeste", nuevo.getNombre());
	}

	@Test
	public void crearDirector() {
		Director nuevo = new Director(1000, "Monica", "JJZ526");
		assertEquals((Integer) 1000, nuevo.getDni());
		assertEquals("Monica", nuevo.getNombre());
		assertEquals("JJZ526", nuevo.getPatenteCorporativa());
	}

	@Test
	public void crearProducto() {
		Producto nuevo = new Producto(1000, "Seguro de vida", 1000.0);
		assertEquals((Integer) 1000, nuevo.getCodigo());
		assertEquals("Seguro de vida", nuevo.getDescripcion());
		assertEquals((Double)1000.0, nuevo.getPrecio(), 0.01);

	}

	@Test
	public void asociarALasPersonasAUnaEmpresaSinRepetirNinguna() {

	}

	@Test
	public void queUnClientePuedaComprarUnNuevoProducto() {

	}

	@Test
	public void queUnEmpleadoTengaUnDescuentoDelVeintePorCiento() {

	}

	@Test
	public void queUnDirectorNoPuedaComprarProductosDeLaPropiaEmpresa() {

	}

}
