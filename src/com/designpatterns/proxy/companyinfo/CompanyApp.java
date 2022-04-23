package com.designpatterns.proxy.companyinfo;

import java.math.BigDecimal;

public class CompanyApp {
    public static void main(String[] args) {
        ProxyRealManager user = new ProxyRealManager("kadir", "1233");

        try {
            BigDecimal annualReturn = user.getAnnualReturn();
            System.out.println("Company annual return : " + annualReturn);
        } catch (IllegalAccessException e) {
            System.out.println("You do not have access to these sensitive informations.");
        }

    }
}
