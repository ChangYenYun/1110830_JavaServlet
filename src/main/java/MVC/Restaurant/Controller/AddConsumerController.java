package MVC.Restaurant.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MVC.Restaurant.Dao.ConsumerDao;
import MVC.Restaurant.Model.Consumer;

@WebServlet("/AddConsumerController")
public class AddConsumerController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.request--->接收username--->判斷帳號重複	"queryRepeat(String username)"。
		 * 2.true--->重複--->addConsumerError。
		 * 3.false--->新增會員--->new Consumer--->add(consuner)。
        */
		request.setCharacterEncoding("utf-8");
		
		String Username = request.getParameter("username");
		
		if(new ConsumerDao().queryRepeat(Username))	
		{
			response.sendRedirect("AddConsumerError.jsp");
		}else{
		String Password = request.getParameter("password");
		String Name = request.getParameter("name");
		String Phone = request.getParameter("phone");
		String Address = request.getParameter("address");
        
		Consumer consumer = new Consumer(Username, Password, Name, Phone, Address);		
		new ConsumerDao().add(consumer);
		
		response.sendRedirect("AddConsumerSuccess.jsp");
		}
	}

}
