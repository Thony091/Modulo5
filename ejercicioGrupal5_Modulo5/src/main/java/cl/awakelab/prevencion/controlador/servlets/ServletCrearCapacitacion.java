package cl.awakelab.prevencion.controlador.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.prevencion.modelo.Capacitacion;

/**
 * EjercicioGrupal 5 - Modulo 5 
 * Integrantes:
 * -Cesar Albornoz
 * -Catalina Muñoz
 * -Jaime Godoy
 * -Anthony Flores
 * 
 *  */

/**
 * Servlet implementation class ServletCrearCapacitacion
 */
@WebServlet("/ServletCrearCapacitacion")
public class ServletCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Servlet Registro Capacitación");
		//Crear una instancia de capacitación para "atrapar" el valor de los parametros del front-end
		Capacitacion capacitacionController = new Capacitacion();
		String rutcliente = request.getParameter("rutCliente");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		int cantasistentes = Integer.parseInt(request.getParameter("cantAsistentes"));
		

		
//		Capacitacion newCapacitacion = new Capacitacion();
//		newCapacitacion.setRutCliente(rutcliente);
//		newCapacitacion.setDia(dia);
//		newCapacitacion.setHora(hora);
//		newCapacitacion.setLugar(lugar);
//		newCapacitacion.setDuracion(duracion);
//		newCapacitacion.setCantidadDeAsistentes(cantasistentes);

		capacitacionController.registroCapacitacion(
					rutcliente, 
					dia, 
					hora, 
					lugar, 
					duracion,
					cantasistentes
					);
		
		response.sendRedirect("index.jsp");
		
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher requestDispatcher;
		 requestDispatcher = request.getRequestDispatcher("crearCapacitacion.jsp");
		 requestDispatcher.forward(request, response);
	}


}
