package patterns.MVCPattern;

import patterns.MVCPattern.Controller.EmployeeController;
import patterns.MVCPattern.Model.Employee;
import patterns.MVCPattern.View.EmployeeDashbooardView;

public class Main {

    public static void main(String[] args) {
        Employee employee = retrieveEmployeeFromServer();
        EmployeeDashbooardView view = new EmployeeDashbooardView();

        EmployeeController employeeController = new EmployeeController(employee, view);

        employeeController.updateDashboard();

    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setSsNumber("3276523");
        employee.setFirstName("james");
        employee.setLastName("Bond");
        employee.setSalary(1250000);

        return employee;
    }
}
