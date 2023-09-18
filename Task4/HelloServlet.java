package com.example.frontend.webui;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletResponse;

@WebServlet("/add")
public class HelloServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id= Integer.parseInt(request.getParameter("ID"));
        String name=request.getParameter("name");
        String language=request.getParameter("lang");
        String framework=request.getParameter("frame");

        String res="Done";
        PrintWriter writer = response.getWriter();
        writer.write(res);
        writer.flush();




    }
}