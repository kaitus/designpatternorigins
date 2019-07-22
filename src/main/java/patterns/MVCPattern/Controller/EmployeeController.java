package patterns.MVCPattern.Controller;

import patterns.MVCPattern.Model.Employee;
import patterns.MVCPattern.View.EmployeeDashbooardView;

public class EmployeeController {
    private Employee employeeModel;
    private EmployeeDashbooardView dashbooardView;

    public EmployeeController(Employee employeeModel, EmployeeDashbooardView dashbooardView) {
        this.employeeModel = employeeModel;
        this.dashbooardView = dashbooardView;
    }

    public void setEmployeeModel( String name, String lastName ) {
        employeeModel.setFirstName(name);
        employeeModel.setLastName(lastName);
    }

    public String getEmployeeName() {
        return employeeModel.getFirstName() + " " + employeeModel.getLastName();
    }

    public void setSSN(String ssn) {
        employeeModel.setSsNumber(ssn);
    }

    public String getSSN() {
        return employeeModel.getSsNumber();
    }

    public void updateDashboard() {
        dashbooardView.printEmployeeInfo(employeeModel);
    }
}
