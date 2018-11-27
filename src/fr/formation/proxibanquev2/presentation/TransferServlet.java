package fr.formation.proxibanquev2.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.proxibanquev2.metier.Account;
import fr.formation.proxibanquev2.metier.AccountService;


public class TransferServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
        List<Account> accounts = AccountService.getInstance().readAllAccountTransfer(id);
        req.setAttribute("accounts", accounts);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/transfert.jsp").forward(req, resp);;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer numberA = Integer.parseInt(req.getParameter("numberA"));
		Integer numberB = Integer.parseInt(req.getParameter("numberB"));
		Float amount = Float.parseFloat(req.getParameter("amount"));
		AccountService service = AccountService.getInstance();
		service.transfer(numberA, numberB, amount);
		resp.sendRedirect(this.getServletContext().getContextPath() + "/index.html");
	}
	
	
}
