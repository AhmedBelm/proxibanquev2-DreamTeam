package fr.formation.proxibanquev2.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.proxibanquev2.metier.Account;
import fr.formation.proxibanquev2.metier.AccountService;
import fr.formation.proxibanquev2.metier.Client;
import fr.formation.proxibanquev2.metier.ClientService;




public class AccountServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * doGet de AccountServlet récupère tous les comptes de la BDD, grâce à la méthode readAllAccountService.
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id_client = Integer.parseInt(req.getParameter("id"));
		List<Account> accounts= AccountService.getInstance().readAllAccountService(id_client);
		Client client = ClientService.getInstance().readClient(id_client);
		req.setAttribute("accounts", accounts);
		req.setAttribute("client", client);
	    this.getServletContext().getRequestDispatcher("/WEB-INF/views/account.jsp").forward(req, resp);
	}
	
	/**
	 * doPost de AccountServlet renvoi les données récuperés dans le doGet et fais une redirection vers l'index. 
	 */
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect(this.getServletContext().getContextPath() + "/index.html");
	}

}
