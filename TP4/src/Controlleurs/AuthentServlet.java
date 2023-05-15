package Controlleurs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modeles.AuthentBean;

/**
 * Servlet implementation class AuthentServlet
 */
@WebServlet("/AuthentServlet")
public class AuthentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AuthentBean authentBean=(AuthentBean)session.getAttribute("authentBean");
		if (authentBean == null){
			String prenom = request.getParameter("prenom");
	        String nom = request.getParameter("nom");
	        authentBean =new AuthentBean();
	        authentBean.setNom(nom);
	        authentBean.setPrenom(prenom);
	        session.setAttribute("authentBean", authentBean);
		}
		String address = "authent.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);

        

        

        
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		  
	}
}
