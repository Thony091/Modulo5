package cl.awakelab.prevencion.modelo;

public class Usuario {
	
	private int id;
	private String usuario;
	private String password;
	private String run;
	private String fechaNacimiento;
	private String nombre;
	private String apellido;
	
	/**
	 * Constructor Vacio.
	 */
	public Usuario() {

	}

	/**
	 * @param id Número identificador de usuario.
	 * @param usuario Username de usuario.
	 * @param password Password de usuario.
	 * @param run Rut del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 */
	public Usuario(int id, String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido) {
		
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getRun() {
		return run;
	}

	public String getPassword() {
		return password;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", run=" + run + ", password=" + password
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
