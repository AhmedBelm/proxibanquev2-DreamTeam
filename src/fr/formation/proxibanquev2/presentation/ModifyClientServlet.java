package fr.formation.proxibanquev2.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.proxibanquev2.metier.Client;
import fr.formation.proxibanquev2.metier.ClientService;

public class ModifyClientServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Client client = ClientService.getInstance().readClient(id);
        req.setAttribute("client", client);
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/modifyClient.jsp").forward(req, resp);
    }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String lastname = req.getParameter("lastname");
		String firstname = req.getParameter("firstname");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		ClientService service = ClientService.getInstance();
		service.updateClient(id, lastname, firstname, email, address);
		resp.sendRedirect(this.getServletContext().getContextPath() + "/index.html");
	}
}

