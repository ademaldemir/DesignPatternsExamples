package com.designpatterns.proxy.companyinfo;

import java.math.BigDecimal;

public class ProxyRealManager implements ICompanyInfos {

    private RealManager realManager;
    private String userName;
    private String password;

    public ProxyRealManager(String userName, String password) {
        this.realManager = new RealManager();
        this.userName = userName;
        this.password = password;
    }

    // Control the user is manager or not
    private boolean isUserManager(){
        boolean isUserManager = false;

        boolean isUserValid = EmployeeUtil.isUserValid(userName, password);



        if (isUserValid){
            Employee employee = EmployeeUtil.getEmployeeByUserName(userName);
            isUserManager = employee.isManager();
        }

        return isUserManager;
    }

    @Override
    public BigDecimal getAnnualReturn() throws IllegalAccessException {
        boolean userManager = isUserManager();

        if (userManager){
            return realManager.getAnnualReturn();
        } else {
            throw new IllegalAccessException();
        }
    }
}
