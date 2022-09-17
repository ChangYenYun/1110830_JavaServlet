package MVC.Restaurant.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MVC.Restaurant.Dao.ConsumerDao;


@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*1.request接收--->username、password。
		 *2.判斷帳號、密碼--->queryuser(帳號、密碼)。
		 *3.response---> true --->LoginSuccess。
		 *4.response---> false --->LoginError。
		*/
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		if(new ConsumerDao().queryUser(Username,Password))
		{
			response.sendRedirect("LoginSuccess.jsp");
		}else
		    response.sendRedirect("LoginError.jsp");
	}

}
