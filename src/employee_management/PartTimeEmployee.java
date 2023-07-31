package employee_management;

public class PartTimeEmployee extends Employee{
    private final double hoursWorked;
    private final double hourlyRate;
    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        String IdAndName = super.toString();
        return IdAndName+", Hours worked: "+this.getHoursWorked();
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
        return 0.15*this.getHoursWorked()*this.getHourlyRate();
    }
}

