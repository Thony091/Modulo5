package cl.awakelab.prevencion.controller.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * EjercicioGrupal 2 - Modulo 5 
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher requestDispatcher;
		 requestDispatcher = request.getRequestDispatcher("listar-capacitaciones.jsp");
		 requestDispatcher.forward(request, response);
	}



}
