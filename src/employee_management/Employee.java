package employee_management;

public abstract class Employee implements Taxable{
    protected final int id;
    protected final String name;

    private static int lastId = 1;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
        if(lastId < this.getId()){
            lastId = this.getId();
        }
    }
    public Employee(String name){
        this.id = lastId + 1;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public static int getLastId() {
        return lastId;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "ID: "+this.getId()+", Name: "+this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee casted){
            return this.getId() == casted.getId() && this.getName().equals(casted.getName());
        }
        return false;
    }
}
