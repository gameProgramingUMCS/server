package com.zrzeda;

import com.zrzeda.rest.UserRestService;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/**
 * Created by mateusz on 07.08.14.
 */
@ApplicationPath("/rest")
public class AplicationREST extends Application {

    public Set<Class<?>> getClasses() {
        Set<Class<?>> clSet=new HashSet<>();
        clSet.add(UserRestService.class);
        return clSet;
    }
}
