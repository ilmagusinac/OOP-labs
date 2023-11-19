package lab7.Exercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeManagmentSystem employeeManagementSystem = new EmployeeManagmentSystem();

        List<Employee> employees = List.of(
                new Employee(1, "Mujo", 50000.0),
                new Employee(2, "Suljo", 60000.0),
                new Employee(3, "Fata", 75000.0)
        );

        List<Employee> filteredEmployees = employeeManagementSystem.filterEmloyeesBySalary(employees, 60000.0);
        System.out.println("Employees with minimum salary:");
        employeeManagementSystem.displayEmployeeDetails(filteredEmployees);

        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);
        System.out.println("Total salary of all employees: $" + totalSalary);

        System.out.println("Employee Details:");
        employeeManagementSystem.displayEmployeeDetails(employees);
    }
}
