package patterns.MVCPattern.View;

import patterns.MVCPattern.Model.Employee;

public class EmployeeDashbooardView {

    public void printEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("SSN: " + employee.getSsNumber());
        System.out.println("Salary: " + employee.getSalary());
    }
}
