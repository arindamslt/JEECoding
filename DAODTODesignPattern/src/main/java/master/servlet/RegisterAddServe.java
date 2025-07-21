package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.FoodDao;
import master.dao.RegisterDao;
import master.dto.FoodDto;
import master.dto.RegisterDto;

/**
 * Servlet implementation class RegisterAddServe
 */
@WebServlet("/RegisterAddServe")
public class RegisterAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String nm=request.getParameter("nm");
		String email=request.getParameter("email");
		String phno=request.getParameter("phno");
		RegisterDto fdto=new RegisterDto();
		fdto.setUname(uname);
		fdto.setPass(pass);
		fdto.setNm(nm);
		fdto.setEmail(email);
		fdto.setPhno(phno);
		RegisterDao fdao=new RegisterDao();
		fdao.addData(fdto);
		response.sendRedirect("Add.jsp");
	}

}
