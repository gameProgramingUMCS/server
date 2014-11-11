package com.zrzeda.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Calendar;
import java.util.Date;

@ManagedBean
@RequestScoped
public class TimesBean {

    public Date getNow() {
        return Calendar.getInstance().getTime();
    }
}
