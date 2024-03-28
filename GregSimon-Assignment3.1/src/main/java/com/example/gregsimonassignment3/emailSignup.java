package com.example.gregsimonassignment3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "emailSignup",
        value = {"/emailSignup"}
)
public class emailSignup extends HttpServlet {
    public emailSignup() {
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        String phone = request.getParameter("phone");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html> <html><head> <title>dachshund</title><meta charset=\"UTF-8\">");
        out.println("<link rel=\"stylesheet\" href=\"stylesheet.css\"></head><body><h1>Dachshund</h1>");
        out.println("<nav> <a href=\"index.jsp\">Home</a> <a href=\"history.jsp\">History</a>");
        out.println("<a href=\"care.jsp\">Care</a><a href=\"email.jsp\">Email Signup</a></nav>");
        out.println("<header></header><main>");
        out.println("<h2>Thanks for submitting</h2>");
        out.println("Name: " + name + "<br>");
        out.println("E-mail:" + email + "<br>");
        out.println("City:" + city + "<br>");
        out.println("Phone Number:" + phone + "<br>");
        out.println("</main><br><footer></footer>&copy; 2024 Greg Simon</body></html>");
    }
}
