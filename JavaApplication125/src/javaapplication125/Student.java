/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication125;

/**
 *
 * @author nikos
 */
public class Student {
    private String namn, efterNamn;
    private int telefoneNum;

    public Student(String namn, String efterNamn, int telefoneNum) {
        this.namn = namn;
        this.efterNamn = efterNamn;
        this.telefoneNum = telefoneNum;
    }

    public Student() {
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getEfterNamn() {
        return efterNamn;
    }

    public void setEfterNamn(String efterNamn) {
        this.efterNamn = efterNamn;
    }

    public int getTelefoneNum() {
        return telefoneNum;
    }

    public void setTelefoneNum(int telefoneNum) {
        this.telefoneNum = telefoneNum;
    }

    @Override
    public String toString() {
        return "Student{" + "namn=" + namn + ", efterNamn=" + efterNamn + ", telefoneNum=" + telefoneNum + '}';
    }
    
    
}
