package fr.formation.proxibanquev2.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import fr.formation.proxibanquev2.metier.ClientService;

public class IndexServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * doGet de IndexServlet récupère tous les clients de la BDD, grâce à la méthode getAll(), de ClientService
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClientService service = ClientService.getInstance();
	    req.setAttribute("clients", service.getAll());
	    this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
	}
	
	/**
	 * doPost de IndexServlet renvoi les données récuperés dans le doGet et fais une redirection vers les différentes pages modify, transfer ou account en fonction de la requête de l'utilisateur..
	 */
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String action = req.getParameter("action");
		switch(action){
			case "modify":
				resp.sendRedirect(this.getServletContext().getContextPath() + "/modify.html?id=" + id);
			break;
			case "transfer":
				resp.sendRedirect(this.getServletContext().getContextPath() + "/transfer.html?id=" + id);
			break;
			case "account":
				resp.sendRedirect(this.getServletContext().getContextPath() + "/account.html?id=" + id);
			break;
		}
		
	}

}
