package jsplearnfirst;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IUserStore;
import dao.UserStore;
import model.User;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		response.setCharacterEncoding("gb2312");
		
		//请求数据的中文乱码问题
        request.setCharacterEncoding("UTF-8");//客户端网页我们控制为UTF-8

		PrintWriter out = response.getWriter();
		String name =   java.net.URLDecoder.decode(     request.getParameter("name"),  "utf-8");;
		String password = request.getParameter("password");

		User user = new User();
		user.Id = 20202;
		user.Name = name;
		out.println("<font size	='2'>");
		out.print("提交的表单内容为:<br>");

		

		try {

			
			IUserStore userStore = new UserStore();
			
			List<User> users=userStore.QueryUserByName("");
			if(users.isEmpty()){
				
				user.Id=1;
			}else	{
				
				user.Id=users.get(0).Id+1;
			}	
			
			
			userStore.InsertUser(user);
			
			users = userStore.QueryUserByName("");
			
			request.setAttribute("users", users);
			
			request.getRequestDispatcher( "4.jsp").forward(request,response); 
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}
		

		out.print("姓名:" + name + "<br>");

		out.print("省份:" + password + "<br>");

		out.print("</font>");

	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("put");
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("delete");
	}

}
