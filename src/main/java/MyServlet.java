import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/patients","/doctors"},loadOnStartup = 1)
public class MyServlet extends HttpServlet {
    public MyServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//        resp.getWriter().write();
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<head>");
        printWriter.print("<title> This is a title </title>");
        printWriter.print("</head>");
        printWriter.print("</html");
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
