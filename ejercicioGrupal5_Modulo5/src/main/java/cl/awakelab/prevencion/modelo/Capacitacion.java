package cl.awakelab.prevencion.modelo;

public class Capacitacion {
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadDeAsistentes;
	
	
	
	/** 
	 * Constructor Vacio.
	 * */
	public Capacitacion() {
		super();
	}
	/**
	 * @param identificador Número de identificador de la capacitación.
	 * @param rutCliente Rut del clinte de la capacitación.
	 * @param dia Día de la capacitación.
	 * @param hora Hora de la capacitación.
	 * @param lugar Lugar de la capacitación.
	 * @param duracion Duración de la capacitación.
	 * @param cantidadDeAsistentes Cantidad de asistentes de la capacitación.
	 */
	public Capacitacion(int rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {
		super();
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
	public int getIdentificador() {
		return identificador;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public String getHora() {
		return hora;
	}
	public String getLugar() {
		return lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public int getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes="
				+ cantidadDeAsistentes + "]";
	}
	
	
	
}
