import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  

public class AddServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
    {
        int num1 =Integer.parseInt(req.getParameter("num1"));
        int num2 =Integer.parseInt(req.getParameter("num2"));

        int total = num1+num2;
        System.out.println("the result is "+ total);
        
        res.setContentType("text/html");//setting the content type  
        PrintWriter pw= res.getWriter();//get the stream to write the data  
          
        //writing html in the stream  
        pw.println("<html><body>");  
        pw.println("Welcome to servlet");  
        pw.println("<br>");  
        pw.println("Adding two numbers : " + total);  
        pw.println("<br>");  
        pw.println("</body></html>");  
          
        pw.close();//closing the stream  

    }
    
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
    	
    	doGet(req,res);

   }
} 
