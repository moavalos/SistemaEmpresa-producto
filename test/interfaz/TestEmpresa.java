package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Cliente;
import dominio.Director;
import dominio.Empleado;
import dominio.Empresa;
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
		Empleado nuevo = new Empleado(19542876, "Celeste");
		assertEquals((Integer) 19542876, nuevo.getDni());
		assertEquals("Celeste", nuevo.getNombre());
	}

	@Test
	public void crearDirector() {
		Director nuevo = new Director(42871963, "Monica", "JJZ526");
		assertEquals((Integer) 42871963, nuevo.getDni());
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
		Empresa empresita = new Empresa("Seguros Turi ip ip ip");
		// 1 director, 3 empleados, 7 clientes
		empresita.vincularPersona(new Director(42871963, "Monica", "JJZ526"));
		empresita.vincularPersona(new Empleado(19542876, "Celeste"));
		empresita.vincularPersona(new Empleado(11836209, "Juan"));
		empresita.vincularPersona(new Empleado(98126782, "Guarango"));
		empresita.vincularPersona(new Cliente(27391098, "Bambino"));
		empresita.vincularPersona(new Cliente(99182641, "jdskla"));
		empresita.vincularPersona(new Cliente(45325433, "gfdgfds"));
		empresita.vincularPersona(new Cliente(64739274, "hfdkjshfsdk"));
		empresita.vincularPersona(new Cliente(46382467, "fhfjkds"));
		empresita.vincularPersona(new Cliente(50328484, "frjesl"));
		empresita.vincularPersona(new Cliente(53823808, "fdkslñfl"));
		
		assertEquals((Integer) 11, empresita.getCantidadPersonasVinculadas());

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
