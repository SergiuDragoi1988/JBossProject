package facades;

import DAO.User;
import org.hibernate.Session;

import java.util.List;

public class UserFacade extends BaseFacade {
    public List<User> getUsers(){
        Session session = openSession();
        List<User>users = session.createQuery("FROM User", User.class).getResultList();
        session.close();

        return users;
    }
}
