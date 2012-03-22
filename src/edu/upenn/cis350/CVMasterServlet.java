package edu.upenn.cis350;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.upenn.cis350.util.DBHelper;


public class CVMasterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public CVMasterServlet() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String requestType = request.getParameter("type");
		
		boolean succeeded =  false;
		if (requestType!=null && requestType.length()>0){
			//TODO: read the request
			
			//TODO: process the request
			
		}
		
		
	
		
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
