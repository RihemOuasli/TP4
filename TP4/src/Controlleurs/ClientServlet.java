package Controlleurs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modeles.ClientBean;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse =request.getParameter("adresse");
		String tel =request.getParameter("tel");
		String email =request.getParameter("email");
		
ClientBean client = new ClientBean();
    client.setNom(nom);
    client.setPrenom(prenom);
    client.setAdresse(adresse);
    client.setTel(tel);
    client.setEmail(email);
// Sauvegarde du client dans la session
 HttpSession session = request.getSession();
 session.setAttribute("client", client);
//Redirection vers la vue d'affichage du client
RequestDispatcher displnf=request.getRequestDispatcher("Client.jsp");
displnf.forward(request, response);


}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
