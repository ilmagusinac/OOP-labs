package lab7.Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagmentSystem {

    public List<Employee> filterEmloyeesBySalary(List<Employee> employees,double minSalary){
        List<Employee> employeesWithGreaterSalary= new ArrayList<Employee>();

        return employees.stream()
                .filter(employee -> employee.salary() >=minSalary)
                .collect(Collectors.toList());
    }

    public double calculateTotalSalary(List<Employee> employees){
        return employees.stream()
                .mapToDouble(employee -> employee.salary())
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> employees){
        employees.forEach(employee -> System.out.println((employee.toString())));
    }
}
