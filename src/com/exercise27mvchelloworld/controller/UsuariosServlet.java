package com.exercise27mvchelloworld.controller;
import com.exercise27mvchelloworld.model.UserModel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "FirsPage", urlPatterns = { "/UsuariosServlet" })
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuariosServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String sid="";
		int iid=0;
		String sname="";
		String sage="";
		short shage=0;
		
		sid=request.getParameter("txtID");
		iid = Integer.parseInt(sid);
		sname=request.getParameter("txtNombre");
		sage=request.getParameter("txtEdad");
		shage = Short.parseShort(sage);
		
		UserModel newUser1 = new UserModel(iid, sname, shage);
		UserModel newUser2 = new UserModel();
		newUser2.setID(iid);
		newUser2.setNombre(sname);
		newUser2.setEdad(shage);
		
	
	}

}
