package sun.study.Servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    private String message;

    public void init(){
        message = "Hello World!";
        System.out.println("Do Init");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();
        pw.write("<h1>" + message + "</h1>");
        System.out.println("Do Get");
    }

    public void destory(){
        System.out.println("Do Destory");
    }
}
