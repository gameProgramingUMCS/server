package com.zrzeda.DAO;

import com.zrzeda.model.User;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by mateusz on 11.11.14.
 */


@Named
public class UserDao implements Serializable{

    @PersistenceContext
    EntityManager em;
    private String SQL;



    public List<User> findUsers() {
            SQL = "select p from User p";
            System.out.println(SQL);
        List<User> users = (List<User>)em.createQuery(SQL).getResultList();
        return users;
    }

    public User findUsers(String userName, String password) {
        SQL = "select p from User p where p.userName=:userName and p.password=:password";
        System.out.println(SQL);
        List<User> users = (List<User>)em.createQuery(SQL)
                .setParameter("userName",userName)
                .setParameter("password",password)
                .getResultList();
        System.out.println("ddddddd" + users);

        return (users!=null&& users.size()>0)?users.get(0):null;
    }

}
