package com.example.admin.model;


import java.io.Serializable;

/**
 * Created by Admin on 9/22/2017.
 */

public class Employee implements Serializable {

    private String name;
    private int icon;

    public Employee(){

    }

    public Employee(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
