package com.example.study_survlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/checkoutResponseServlet")
public class CheckoutResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String username = request.getParameter("username");
            String emailaddress = request.getParameter("emailaddress");
            String address = request.getParameter("address");
            String address2 = request.getParameter("address2");
            String country = request.getParameter("country");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");


            PrintWriter printWriter = response.getWriter(); 

            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "\r\n" + //
                    "<head>\r\n" + //
                    "  <meta charset=\"UTF-8\">\r\n" + //
                    "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + //
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "  <title>Check Out Form Completed</title>\r\n" + //
                    "</head>\r\n" + //
                    "\r\n" + //
                    "<body>\r\n" + //
                    "  <div>\r\n" + //
                    "    <span style=\"font-weight: bold;font-size: 15pt;\">\r\n" + //
                    "      Billing address\r\n" + //
                    "    </span>\r\n" + //
                    "  </div>\r\n" + //
                    "  \r\n" + //
                    "  <div>&nbsp;</div>\r\n" + //
                    "\r\n" + //
                    "  <div>\r\n" + //
                    "\r\n" + //
                    "          <div>\r\n" + //
                    "            <label for=\"firstname\">First Name </label><input type=\"text\" name=\"firstname\" id=\"firstname\" placeholder="+firstname+">\r\n" + //
                    "          </div>\r\n" + //
                    "    \r\n" + //
                    "          <div>\r\n" + //
                    "            <label for=\"lastname\">Last Name </label><input type=\"text\" name=\"lastname\" id=\"lastname\" placeholder="+lastname+">\r\n" + //
                    "          </div>\r\n" + //
                    "    \r\n" + //
                    "          <div>&nbsp;<div>\r\n" + //
                    "    \r\n" + //
                    "              <div>\r\n" + //
                    "                <div>\r\n" + //
                    "                  <label for=\"username\">User Name </label>\r\n" + //
                    "                </div><input type=\"text\" name=\"username\" id=\"username\" placeholder="+username+">\r\n" + //
                    "              </div>\r\n" + //
                    "    \r\n" + //
                    "              <div>&nbsp;<div>\r\n" + //
                    "    \r\n" + //
                    "                  <div>\r\n" + //
                    "                    <label for=\"emailaddress\">\r\n" + //
                    "                      Email \r\n" + //
                    "                      <span style=\"color:gray\">\r\n" + //
                    "                        (Optional) \r\n" + //
                    "                      </span>\r\n" + //
                    "                    </label>\r\n" + //
                    "                    <input type=\"text\" name=\"emailaddress\" id=\"emailaddress\" placeholder="+emailaddress+">\r\n" + //
                    "                  </div>\r\n" + //
                    "    \r\n" + //
                    "                  <div>&nbsp;<div>\r\n" + //
                    "    \r\n" + //
                    "                      <div>\r\n" + //
                    "                        <label for=\"address\">Address </label><input type=\"text\" name=\"address\" id=\"address\" placeholder="+address+">\r\n" + //
                    "                      </div>\r\n" + //
                    "    \r\n" + //
                    "                  <div>\r\n" + //
                    "                    <label for=\"address2\">\r\n" + //
                    "                      Address 2 \r\n" + //
                    "                      <span style=\"color:gray\">\r\n" + //
                    "                        (Optional) \r\n" + //
                    "                      </span>\r\n" + //
                    "                    </label>\r\n" + //
                    "                    <input type=\"text\" name=\"address2\" id=\"address2\" placeholder="+address2+">\r\n" + //
                    "                  </div>\r\n" + //
                    "\r\n" + //
                    "              <div>&nbsp;<div>\r\n" + //
                    "\r\n" + //
                    "                      <div>\r\n" + //
                    "                        <table>\r\n" + //
                    "\r\n" + //
                    "                          <tr>\r\n" + //
                    "                            <td><label for=\"country\">Country</label></td>\r\n" + //
                    "                            <td><label for=\"state\">State</label></td>\r\n" + //
                    "                            <td><label for=\"zip\">Zip</label></td>\r\n" + //
                    "                          </tr>\r\n" + //
                    "\r\n" + //
                    "                          <tr>\r\n" + //
                    "                            <td>\r\n" + //
                    "                              <input type=\"text\" name=\"country\" id=\"country\" placeholder="+country+">\r\n" + //
                    "                            </td>\r\n" + //
                    "                            <td>\r\n" + //
                    "                              <input type=\"text\" name=\"state\" id=\"state\" placeholder="+state+">\r\n" + //
                    "                            </td>\r\n" + //
                    "                            <td>\r\n" + //
                    "                              <input type=\"text\" name=\"zip\" id=\"zip\" placeholder="+zip+">\r\n" + //
                    "                            </td>\r\n" + //
                    "                          </tr>\r\n" + //
                    "\r\n" + //
                    "                        </table>\r\n" + //
                    "\r\n" + //
                    "\r\n" + //
                    "                      </div>\r\n" + //
                    "\r\n" + //
                    "  </div>\r\n" + //
                    "\r\n" + //
                    "\r\n" + //
                    "\r\n" + //
                    "</body>\r\n" + //
                    "\r\n" + //
                    "</html>";
            printWriter.println(contents);
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
