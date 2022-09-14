package callcenter;

public class Contacto {

	private String nombre;
	private String apellido;
	private String celular;
	private String email;
	private String direccion;
	private Integer cp;
	private String localidad;
	private Provincias provincia;
	private Boolean esCliente;
	private Boolean reLlamado;
	
	public Contacto(String nombre, String apellido, String celular, String email, String direccion, Integer cp,
			String localidad, Provincias provincia, Boolean esCliente, Boolean reLlamado) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setCelular(celular);
		this.setEmail(email);
		this.setDireccion(direccion);
		this.setCp(cp);
		this.setLocalidad(localidad);
		this.setProvincia(provincia);
		this.setEsCliente(esCliente);
		this.setReLlamado(reLlamado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincias getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincias provincia) {
		this.provincia = provincia;
	}

	public Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getReLlamado() {
		return reLlamado;
	}

	public void setReLlamado(Boolean reLlamado) {
		this.reLlamado = reLlamado;
	}
}
