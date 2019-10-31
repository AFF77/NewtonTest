/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication125;

/**
 *
 * @author aysen
 */
public class School {
    private String name;
    private String info;
    private static final int ID = 01;

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public School(String name, String info) {
        this.name = name;
        this.info = info;
    }

    @Override
    public String toString() {
        return "School{" + "name=" + name + ", info=" + info + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
