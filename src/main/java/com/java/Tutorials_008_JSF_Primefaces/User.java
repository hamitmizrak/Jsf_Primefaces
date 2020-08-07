package com.java.Tutorials_008_JSF_Primefaces;


import javax.faces.bean.ManagedBean;


@ManagedBean(name = "user")
public class User {
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}