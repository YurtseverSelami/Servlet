package mypages;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectt.datamodel;
import connectt.ourKonnektor;

/**
 * Servlet implementation class myindeks
 */
@WebServlet("/myindeks")
public class myindeks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myindeks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ourKonnektor o = new ourKonnektor();

ArrayList<datamodel> mydata = o.getitems();
PrintWriter out= response.getWriter();
String context="<html> <head> <link rel=\"stylesheet\" type=\"text/css\" href= \"nf.css\"> </head> <body>";
context += "div id=\"container\"> dib id=\"header\"> header content here";
context+="</div> <div id=\"content\"> main content here";
context+="<div id=\"sidebar\">";
context+="<ul\">";
for(datamodel d:mydata)
{
	context+="<li>" + d.getTopic()+"</li>";
}
context+="</ul\">";
context = "<html> <body>";
context+="</body> </html>";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
