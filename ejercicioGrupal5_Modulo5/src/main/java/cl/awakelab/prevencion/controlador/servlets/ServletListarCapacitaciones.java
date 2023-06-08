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
 * Servlet implementation class ServletListarCapacitaciones
 */
@WebServlet("/ServletListarCapacitaciones")
public class ServletListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	  @Override
	  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    Capacitacion capacitacion = new Capacitacion();
	    System.out.println("Servlet Listar Capacitaciones inside");
	  
	    
	    request.setAttribute("capacitaciones", capacitacion.findAllTraining());
	    // reenviar esta informacion a un JSP
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/listar-capacitaciones.jsp");
	    dispatcher.forward(request, response);
	  }
	
	
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 RequestDispatcher requestDispatcher;
//		 requestDispatcher = request.getRequestDispatcher("listar-capacitaciones.jsp");
//		 requestDispatcher.forward(request, response);
//	}



}
