package jsplearnfirst;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class helloworld extends  HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response){
		
		try
		{
			response.setContentType("text/html");
			PrintWriter  writer=response.getWriter();
			writer.println("<h2>hello world</h2>");
		
		}
		catch(IOException ioException)
		{
			
			ioException.printStackTrace();
		}
	}
}
