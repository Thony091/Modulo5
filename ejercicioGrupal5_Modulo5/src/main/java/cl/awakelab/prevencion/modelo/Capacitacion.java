package cl.awakelab.prevencion.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.conexion.DBConnection;

public class Capacitacion {
	private int identificador;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadDeAsistentes;
	
	
	
	/** 
	 * Constructor Vacio.
	 * */
	public Capacitacion() {
		
	}
	
	
	/**

	 * @param identificador Número de identificador de la capacitación.
	 * @param rut Rut del clinte de la capacitación.
	 * @param dia Día de la capacitación.
	 * @param hora Hora de la capacitación.
	 * @param lugar Lugar de la capacitación.
	 * @param duracion Duración de la capacitación.
	 * @param cantidadDeAsistentes Cantidad de asistentes de la capacitación.
	 */
	public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
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
	public Capacitacion(String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {

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
	public String getRutCliente() {
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

	public void setRutCliente(String rutCliente) {
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
	
	
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes="
				+ cantidadDeAsistentes + "]";
	}
	
	public void registroCapacitacion(String rutcliente, String dia, String hora, String lugar, String duracion, int cantidadasistentes) {
		
		DBConnection conexion = DBConnection.getInstance();//hacer o crear la conexion a la base de datos
		
		String sql = "INSERT INTO capacitacion(rutcliente,dia,hora,lugar,duracion,cantidadasistentes) VALUES (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setString(1, rutcliente);
			statement.setString(2, dia);
			statement.setString(3, hora);
			statement.setString(4, lugar);
			statement.setString(5, duracion);
			statement.setInt(6, cantidadasistentes);
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public List<Capacitacion> findAllTraining() {
		
		List<Capacitacion> capacitaciones = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT * FROM capacitacion";
		
		try {
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();			
			
			while(rs.next()) {				
				
				int id 					= rs.getInt("id");
				String rut 				= rs.getString("rutcliente");
				String dia 				= rs.getString("dia");
				String hora 			= rs.getString("hora");
				String lugar			= rs.getString("lugar");
				String duracion 		= rs.getString("duracion");
				int cantAsistentes		= rs.getInt("cantidadasistentes");
				
				Capacitacion capacitacion = new Capacitacion(id,rut,dia,hora,lugar,duracion,cantAsistentes);
				capacitaciones.add(capacitacion);
				System.out.println(capacitacion);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		}	
	
		return capacitaciones;
		
	}
	
}
