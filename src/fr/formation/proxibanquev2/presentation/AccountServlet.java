package fr.formation.proxibanquev2.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.proxibanquev2.metier.AccountService;


public class AccountServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AccountService service = AccountService.getInstance();
	    req.setAttribute("account", service.getAll());
	    this.getServletContext().getRequestDispatcher("/WEB-INF/views/account.jsp").forward(req, resp);
	}

}
