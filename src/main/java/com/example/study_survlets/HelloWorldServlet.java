package com.example.study_survlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/helloWorldServlet")

public class HelloWorldServlet extends HttpServlet{
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("HelloWerldServlet = doGet()");
    try {
        String firstName = "Moony";
        String secondName = "Code";

        PrintWriter printWriter = response.getWriter();
        String contents = "<!DOCTYPE html>\r\n" + //
                "<html lang=\"en\">\r\n" + //
                "<head>\r\n" + //
                "  <meta charset=\"UTF-8\">\r\n" + //
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                "  <title>Hello World !</title>\r\n" + //
                "</head>\r\n" + //
                "<body>\r\n" + //
                "  <div>first Name : "+firstName+"</div>\r\n" + //
                "  <div>second Name : Choi "+secondName"</div>\r\n" + //
                "</body>\r\n" + //
                "</html>";
        printWriter.close();
 
      
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    System.out.println("HelloWorldServlet - doGet() done.");
}
}
