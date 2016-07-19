package jsplearnfirst;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File; 

import java.io.IOException; 

import java.io.PrintWriter; 

import java.util.Iterator; 

import javax.servlet.ServletException; 

import javax.servlet.http.HttpServlet; 

import javax.servlet.http.HttpServletRequest; 

import javax.servlet.http.HttpServletResponse; 

import org.apache.commons.fileupload.FileItem; 

import org.apache.commons.fileupload.FileItemFactory; 

import org.apache.commons.fileupload.FileUploadException; 

import org.apache.commons.fileupload.disk.DiskFileItemFactory; 

import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
 * Servlet implementation class upload
 */
@WebServlet("/upload")
public class upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		response.getWriter().append("Served at: post ").append(request.getContextPath());
		boolean isMultipart=ServletFileUpload.isMultipartContent(request);
		if(isMultipart){
			FileItemFactory  factory= new  DiskFileItemFactory();
			ServletFileUpload upload=new ServletFileUpload(factory);
			Iterator items;
			try	{
				
				items =upload.parseRequest(request).iterator();
				
				while(items.hasNext()){
					FileItem  item=(FileItem) items.next();
					if(!item.isFormField()){

						String name=item.getName();
						String fileName=name.substring(name.lastIndexOf('\\')+1,name.length());
						String path=request.getRealPath("upload")+File.separatorChar+fileName;
						
						File uploadFile=new File(path);
						item.write(uploadFile);
						
						
					
						response.getWriter().println("保存的地址为"+ path);
						//response.getWriter().println("下载地址：<a href='"+ path+"' >下载</a>");
					}
					
					
					
				}
			}catch( Exception  e){
				
				e.printStackTrace();
			}
			
		}
		
		

		
	}

}
