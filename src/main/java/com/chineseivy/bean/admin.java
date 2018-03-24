package com.chineseivy.bean;

import java.io.Serializable;

/**
 * Created by Shiming Lee on 2018/3/22
 */
public class admin implements Serializable {
    private int adminID;
    private String adminPassword;
    private String admin;

    public admin() {
    }

    public admin(int adminID, String adminPassword, String admin) {
        this.adminID = adminID;
        this.adminPassword = adminPassword;
        this.admin = admin;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
