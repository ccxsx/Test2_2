import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;


@WebServlet({"/wanyi","/qsx","/cql"})

public class ServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        Conn.getConnection();
        Conn.getinfo();
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("<h1 style=\"color:deepskyblue\">");
        resp.getWriter().write("<br/><a href=\"http://localhost:8080/Servlet2\">click here</a>\n");
        resp.getWriter().write("<br/><a href=\"http://localhost:8080/login1.html\">or click here</a><br/>\n");
        try {
            Statement stm = Conn.con.createStatement();
            String sql = "select * from a";
            System.out.println(sql);
            ResultSet rs = stm.executeQuery(sql);
            int a;
            String s1;
            while (rs.next()) {
                a=rs.getInt(1);
                s1=	rs.getString(3);
                resp.getWriter().write(s1+"   "+a);
                System.out.println(a);
                System.out.println(s1);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        resp.getWriter().write("</h1>");

        System.out.println("Test 01...");
        System.out.println(req);
    }
}
