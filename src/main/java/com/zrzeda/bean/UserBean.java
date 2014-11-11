package com.zrzeda.bean;

import com.zrzeda.DAO.UserDao;
import com.zrzeda.model.User;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusz on 04.08.14.
 */

@Named
@SessionScoped
public class UserBean   implements Serializable{

    @PersistenceContext
    EntityManager em;
    @Inject
    private UserDao userDao;

    private String SQL;

    List<User> users=new ArrayList<User>();

    public List<User> findUsers() {
        if (users == null) {
            users = userDao.findUsers();
        }

        return users;
    }

    public Boolean findUsers(String userName, String password) {
         User user= userDao.findUsers(userName,password);
        if(user==null){
            return false;
        }
        users.add(user);
        return true;
    }
}
