package com.zrzeda.bean;

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
    private String SQL;

    List<User> users;

    public List<User> findUsers() {
        if (users == null) {
            SQL = "select p from User p";
            System.out.println(SQL);
            users = em.createQuery(SQL).getResultList();
        }

        return users;
    }
    
}
