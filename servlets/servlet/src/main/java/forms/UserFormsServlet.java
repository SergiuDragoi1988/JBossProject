package forms;

import DAO.User;
import facades.UserFacade;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserFormsServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserFacade userFacade = new UserFacade();

        String insertAttribute = req.getParameter("insert");
        if (insertAttribute != null) {
            String nameAttribute = req.getParameter("name");
            String emailAttribute =req.getParameter("email");
            String countryAttribute =req.getParameter("country");
            userFacade.insert(nameAttribute,emailAttribute,countryAttribute);


        }

        String deleteAttribut = req.getParameter("delete");
        if (deleteAttribut != null){
            int userId = Integer.parseInt(deleteAttribut);
            userFacade.delete(userId);
        }

        List<User>users = userFacade.getUsers();
        req.setAttribute("users",users);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/forms/UseForm.jsp");
        requestDispatcher.forward(req,resp);
    }
}
