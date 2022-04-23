package com.designpatterns.proxy.companyinfo;

import java.math.BigDecimal;

public class RealManager implements ICompanyInfos {
    @Override
    public BigDecimal getAnnualReturn() {
        return BigDecimal.valueOf(100000);
    }
}
