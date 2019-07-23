import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", urlPatterns = {"/translate"})
public class TranslateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dic = new HashMap<String, String>();
        dic.put("house","nha");
        dic.put("char","ghe");
        dic.put("people","nguoi");
        dic.put("car","oto");

        String search = dic.get(request.getParameter("eng"));

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if(search !=null) {
            writer.println("<h3>Vietnamese: " + search + "</h3>");
        }
        else {
            writer.println("<h3>Khong tim thay</h3>");
        }
        writer.println("</html>");
    }
}
