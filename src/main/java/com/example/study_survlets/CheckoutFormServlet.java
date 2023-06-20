package com.example.study_survlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/checkoutFormServlet")
public class CheckoutFormServlet extends HttpServlet{
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    try {
      PrintWriter printWriter = response.getWriter();
      String contents = "<!DOCTYPE html>\r\n" + //
          "<html lang=\"en\">\r\n" + //
          "\r\n" + //
          "<head>\r\n" + //
          "  <meta charset=\"UTF-8\">\r\n" + //
          "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + //
          "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
          "  <title>Check Out Form</title>\r\n" + //
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
          "    <form action=\"/checkoutResponseServlet\" method=\"get\">\r\n" + //
          "          <div>\r\n" + //
          "            <label for=\"firstname\">First Name </label><input type=\"text\" name=\"firstname\" id=\"firstname\">\r\n" + //
          "          </div>\r\n" + //
          "    \r\n" + //
          "          <div>\r\n" + //
          "            <label for=\"lastname\">Last Name </label><input type=\"text\" name=\"lastname\" id=\"lastname\">\r\n" + //
          "          </div>\r\n" + //
          "    \r\n" + //
          "          <div>&nbsp;<div>\r\n" + //
          "    \r\n" + //
          "              <div>\r\n" + //
          "                <div>\r\n" + //
          "                  <label for=\"username\">User Name </label>\r\n" + //
          "                </div><input type=\"text\" name=\"username\" id=\"username\" placeholder=\"Username\">\r\n" + //
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
          "                    <input type=\"text\" name=\"emailaddress\" id=\"emailaddress\" placeholder=\"you@example.com\">\r\n" + //
          "                  </div>\r\n" + //
          "    \r\n" + //
          "                  <div>&nbsp;<div>\r\n" + //
          "    \r\n" + //
          "                      <div>\r\n" + //
          "                        <label for=\"address\">Address </label><input type=\"text\" name=\"address\" id=\"address\" placeholder=\"1234 Main St\">\r\n" + //
          "                      </div>\r\n" + //
          "    \r\n" + //
          "                  <div>\r\n" + //
          "                    <label for=\"address2\">\r\n" + //
          "                      Address 2 \r\n" + //
          "                      <span style=\"color:gray\">\r\n" + //
          "                        (Optional) \r\n" + //
          "                      </span>\r\n" + //
          "                    </label>\r\n" + //
          "                    <input type=\"text\" name=\"address2\" id=\"address2\" placeholder=\"Apartment or suite\">\r\n" + //
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
          "                              <select name=\"country\" id=\"country\">\r\n" + //
          "                                <option value=\"\" selected>Choose...</option>\r\n" + //
          "                                <option value=\"korea\">Korea</option>\r\n" + //
          "                                <option value=\"unitedstates\">United States</option>\r\n" + //
          "                                <option value=\"canada\">Canada</option>\r\n" + //
          "                                <option value=\"australia\">Australia</option>\r\n" + //
          "                                <option value=\"japan\">Japan</option>\r\n" + //
          "                              </select>\r\n" + //
          "                            </td>\r\n" + //
          "                            <td>\r\n" + //
          "                              <select name=\"state\" id=\"state\">\r\n" + //
          "                                <option value=\"\" selected>Choose...</option>\r\n" + //
          "                                <option value=\"seoul\">Seoul</option>\r\n" + //
          "                                <option value=\"california\">California</option>\r\n" + //
          "                                <option value=\"calgary\">Calgary</option>\r\n" + //
          "                                <option value=\"melbourne\">Melbourne</option>\r\n" + //
          "                                <option value=\"tokyo\">Tokyo</option>\r\n" + //
          "                              </select>\r\n" + //
          "                            </td>\r\n" + //
          "                            <td>\r\n" + //
          "                              <input type=\"text\" name=\"zip\" id=\"zip\">\r\n" + //
          "                            </td>\r\n" + //
          "                          </tr>\r\n" + //
          "\r\n" + //
          "                        </table>\r\n" + //
          "\r\n" + //
          "\r\n" + //
          "                      </div>\r\n" + //
          "                      <div><button type=\"submit\">Submit</button></div>\r\n" + //
          "    </form>\r\n" + //
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
