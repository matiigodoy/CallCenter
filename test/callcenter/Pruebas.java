package callcenter;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas {

	@Test
	public void QueSePuedaCrearContacto() {
		final String NOMBRE = "Matías";
		final String APELLIDO = "Godoy";
		final String CELULAR = "+5491112345678";
		final String EMAIL = "mgodoy@alumno.unlam.edu.ar";
		final String DIRECCION = "Calle Falsa 123";
		final Integer CP = 1754;
		final String LOCALIDAD = "San Justo";
		final Provincias PROVINCIA = Provincias.BuenosAires;
		final Boolean ESCLIENTE = false;
		final Boolean RELLAMADO = true;
		
		Contacto contacto = new Contacto(NOMBRE, APELLIDO, CELULAR, EMAIL, DIRECCION, CP, LOCALIDAD, PROVINCIA, ESCLIENTE, RELLAMADO);
		
		assertNotNull(contacto);
		assertEquals(NOMBRE,contacto.getNombre());
		assertEquals(APELLIDO,contacto.getApellido());
		assertEquals(CELULAR,contacto.getCelular());
		assertEquals(EMAIL,contacto.getEmail());
		assertEquals(DIRECCION,contacto.getDireccion());
		assertEquals(CP,contacto.getCp());
		assertEquals(LOCALIDAD,contacto.getLocalidad());
		assertEquals(PROVINCIA,contacto.getProvincia());
		assertEquals(ESCLIENTE,contacto.getEsCliente());
		assertEquals(RELLAMADO,contacto.getReLlamado());
	}
	
	@Test
	public void QueSePuedaBuscarYMostrarCandidato() {
		final Boolean ESCLIENTE = false;
		final Boolean RELLAMADO = true;
		Contacto contacto1 = new Contacto("Pepe", "Zárate", "+5491144556677", "contacto1@outlook.com", "Calle Falsa 123", 1234, "Desconocida", Provincias.Cordoba, true, false);
		Contacto contacto2 = new Contacto("José", "Rodriguez", "+5491134560987", "contacto2@outlook.com", "Av Siempre Viva 742", 1634, "No lo sé", Provincias.EntreRios, false, true);
		Contacto contacto3 = new Contacto("Lucas", "Pérez", "+5491162354679", "contacto3@outlook.com", "Corrientes 1600", 1854, "Algún lugar", Provincias.Chaco, true, true);
		Contacto contacto4 = new Contacto("Roberto", "Gonzalez", "+5491144116745", "contacto4@outlook.com", "Callao 1200", 1970, "San Justo", Provincias.Corrientes, false, false);
		
		
		ListaClientes lista = new ListaClientes();
		lista.agregarContacto(contacto1);
		lista.agregarContacto(contacto2);
		lista.agregarContacto(contacto3);
		lista.agregarContacto(contacto4);
		Contacto candidato = lista.buscarCandidato();
		
		assertEquals(ESCLIENTE, candidato.getEsCliente());
		assertEquals(RELLAMADO, candidato.getReLlamado());
	}
	 
	@Test
	public void QueSePuedaAgregarClienteALista() {
		
	}

}
