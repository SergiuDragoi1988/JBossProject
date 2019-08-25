package test;

import DAO.User;
import facades.UserFacade;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserFacade userFacade = new UserFacade();
        List<User> users = userFacade.getUsers();

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("The users are: ");
        users.forEach(user -> {
            writer.println("<li>");
            writer.println(user.getName());
            writer.println("</li>");

        });
        writer.println("</body>");
        writer.println("</html>");


    }
}
