package com.zrzeda.rest;

import com.zrzeda.bean.UserBean;
import com.zrzeda.model.User;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by mateusz on 07.08.14.
 */
    @Path("/users")
public class UserRestService {
    @Inject
    private UserBean userBean;

    @GET
    @Path("/get")
    @Produces("application/json")
    public List<User> getProductInJSON() {
        return userBean.findUsers();

    }



    @GET
    @Path("/auth/{userName}/{password}")
    @Produces("text/plain")
    public String authorizeUser(@PathParam("userName")  String userName,@PathParam("password")  String password){
        Boolean authorize = userBean.findUsers(userName,password);
    //TODO:dodac ciekawsza autoryzacje
        return authorize.toString();
    }


}
