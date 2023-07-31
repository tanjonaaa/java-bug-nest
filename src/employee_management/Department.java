package employee_management;

import java.util.List;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    private final String name;
    private final List<Employee> employeesSet;

    public Department(String name, List<Employee> employeesSet) {
        this.name = name;
        this.employeesSet = employeesSet;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeesSet() {
        return employeesSet;
    }

    public void addEmployee(Employee emp){
        if(!this.employeesSet.contains(emp)) this.employeesSet.add(emp);
    }

    public void allDetails(){
        for (Employee employee : this.employeesSet) {
            System.out.println(employee.toString() +", Pay: "+employee.calculatePay());
        }
    }
}
