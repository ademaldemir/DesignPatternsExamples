package com.designpatterns.proxy.companyinfo;

public class Employee {
    private String userName;
    private String password;
    private boolean isManager;

    public Employee(String userName, String password, boolean isManager) {
        this.userName = userName;
        this.password = password;
        this.isManager = isManager;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
