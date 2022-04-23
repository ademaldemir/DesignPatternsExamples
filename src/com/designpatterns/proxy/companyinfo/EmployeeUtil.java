package com.designpatterns.proxy.companyinfo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {
    public static List<Employee> getEmployeeList(){
        Employee kadir = new Employee("kadir", "1233", true);
        Employee adem = new Employee("adem", "3456", false);
        Employee justin = new Employee("justin", "645734", false);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(kadir);
        employeeList.add(adem);
        employeeList.add(justin);

        return employeeList;
    }

    // give username take the object of employee
    public static Map<String, Employee> getUserNameEmployeeMap(){
        List<Employee> employeeList = getEmployeeList();

        Map<String, Employee> mapEmployee = new LinkedHashMap<>();

        for (Employee employee :
                employeeList) {
            mapEmployee.put(employee.getUserName(), employee);
        }
       return mapEmployee;
    }

    public static Employee getEmployeeByUserName(String userName){
        Map<String, Employee> mapEmployee = getUserNameEmployeeMap();

        Employee employee = mapEmployee.get(userName);

        return employee;
    }


    public static boolean isUserValid(String userName, String password) {
        boolean isUserValid = false;

        Employee employee = getEmployeeByUserName(userName);

        if (employee != null) {
            isUserValid = employee.getPassword().equals(password);
        }

        return isUserValid;

    }
}
