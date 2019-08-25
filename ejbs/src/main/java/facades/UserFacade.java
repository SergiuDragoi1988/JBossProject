package facades;

import DAO.Address;
import DAO.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserFacade extends BaseFacade {
    public List<User> getUsers(){
        Session session = openSession();
        List<User>users = session.createQuery("FROM User", User.class).getResultList();
        session.close();

        return users;
    }

    public void insert(String name, String email,String country){
        Session session = openSession();
        Transaction transaction = session.beginTransaction();

        User u = new User();
        u.setName(name);
        u.setEmail(email);
        session.persist(u);



        transaction.commit();
        session.close();

    }

    public void delete(int userId){
        Session session = openSession();
        Transaction transaction = session.beginTransaction();

        User u = session.find(User.class,userId);
        session.delete(u);
        transaction.commit();
        session.close();


    }
}
