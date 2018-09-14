package com.project.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	double result = 0.00;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double num1 = Double.parseDouble(request.getParameter("txt1"));
		double num2 = Double.parseDouble(request.getParameter("txt2"));
		String op = request.getParameter("op");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset='ISO-8859-1'>\r\n"
				+ "<title>Calculator</title>\r\n <style>\r\n" + 
				"body {\r\n" + 
				"    background-color: gray;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"</style>" + "</head>\r\n" + "<body>\r\n" + "\r\n" + "      \r\n"
				+ "        <form action='test' method='get' name='frm'>\r\n" + "        \r\n"
				+ "               Enter num1:\r\n" + "               <input name='txt1' type='text' value='" + (num1)
				+ "' /></br>\r\n" + "            \r\n" + "\r\n" + "                Enter num2:\r\n"
				+ "               <input name='txt2' type='text'  value='" + (num2) + "' /></br>\r\n"
				+ "            \r\n" + "           \r\n" + "               Operator\r\n" + "                \r\n"
				+ "                <select name='op'>\r\n" + "                   \r\n"
				+ "                    <option value='Addition'>Addition</option>\r\n"
				+ "                    <option value='Subtraction'>Subtraction</option>\r\n"
				+ "                    <option value='multiplication'>multiplication</option>\r\n"
				+ "                    <option value='division'>division</option>\r\n"
				+ "                </select>\r\n</br>" + "            \r\n" + "      </br>\r\n" + "\r\n"
				+ "                <input type='submit' value='submit' />\r\n" + "            \r\n"
				+ "        </form>\r\n" + "    \r\n" + "</body>\r\n" + "</html>");

		switch (op) {
		case "Addition":
			add(num1, num2);
			out.println("\nAddition : "+result);
			break;
		case "Subtraction":
			subtract(num1, num2);
			out.println("\nSubtraction : "+result);
			break;
		case "multiplication":
			multiply(num1, num2);
			out.println("\nmultiplication :"+result);
			break;
		case "division":
			divide(num1, num2);
			out.println("\ndivision :"+result);
			break;
		default:
			result = 0.00;
		}
	}

	public double add(double first, double second) {
		result = first + second;
		return result;
	}

	public double subtract(double first, double second) {
		result = first - second;
		return result;
	}

	public double multiply(double first, double second) {
		result = first * second;
		return result;
	}

	public double divide(double first, double second) {
		result = first / second;
		return result;
	}

}
