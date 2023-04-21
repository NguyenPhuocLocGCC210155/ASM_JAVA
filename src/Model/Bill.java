/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Hp
 */
public class Bill implements Serializable {
    boolean hairCut;
    int ben;
    boolean dying;
    double total;
    String cusName;
    String sytleList;
    String date;

    public Bill(int ben, double total, String cusName, String sytleList, String date,  boolean [] service) {
        this.ben = ben;
        this.total = total;
        this.cusName = cusName;
        this.sytleList = sytleList;
        this.date = date;
        this.hairCut = service[0];
        this.dying = service[1];
    }

    public Bill() {
    }

    public boolean isHairCut() {
        return hairCut;
    }

    public void setHairCut(boolean hairCut) {
        this.hairCut = hairCut;
    }

    public int getBen() {
        return ben;
    }

    public void setBen(int ben) {
        this.ben = ben;
    }

    public boolean isDying() {
        return dying;
    }

    public void setDying(boolean dying) {
        this.dying = dying;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getSytleList() {
        return sytleList;
    }

    public void setSytleList(String sytleList) {
        this.sytleList = sytleList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
