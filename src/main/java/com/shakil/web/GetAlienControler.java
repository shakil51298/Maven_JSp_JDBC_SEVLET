package com.shakil.web;

import java.io.IOException;

import com.shakil.web.dao.AlianDAO;
import com.shakil.web.model.AlianData;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetAlienControler extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		// 1 need to make object of where Data will store;
		
		// 3 need of Dao
		AlianDAO dao = new AlianDAO() ; 
		
		
		//2 object of AlianData
		AlianData alian = dao.getAlian(id); 
		
		// send alian data as object in showAlidanData.jsp page;
		request.setAttribute("alian", alian);
		
		// redirect with requestDispatcher cuz of need response to get data;
		RequestDispatcher rd = request.getRequestDispatcher("showAlianData.jsp");
		rd.forward(request, response);
		
		
	}
}
