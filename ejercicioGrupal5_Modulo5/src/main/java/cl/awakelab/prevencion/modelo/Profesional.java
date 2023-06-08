package cl.awakelab.prevencion.modelo;

public class Profesional extends Usuario{
	private String titulo;
	private String fechaIngreso;
	
	/**
	 * Constructor Vacio.
	 */
	public Profesional() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 * @param titulo Titulo de estudios del Profesional.
	 * @param fechaIngreso Fecha de ingreso a la empresa del Profesional.
	 */
	public Profesional(int id, String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido, String titulo, String fechaIngreso) {
		super(id, usuario, password, run, fechaNacimiento, nombre, apellido);
		this.titulo=titulo;
		this.fechaIngreso=fechaIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
}
