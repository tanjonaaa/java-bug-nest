package employee_management;

public class FullTimeEmployee extends Employee{
    private final double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            return obj.getClass() == this.getClass();
        }
        return false;
    }

    @Override
    public double calculateTax() {
        return 0.2*this.getMonthlySalary();
    }
}

