package employee_management;

public class TestCases {
    public static FullTimeEmployee fullTimeEmployeeKoto(){
        return new FullTimeEmployee(1, "Koto", 3_000_000);
    }

    public static PartTimeEmployee partTimeEmployeeLita(){
        return new PartTimeEmployee(1, "Lita", 22, 11_750);
    }

    public static void main(String[] args) {
        FullTimeEmployee koto = TestCases.fullTimeEmployeeKoto();
        FullTimeEmployee koto2 = TestCases.fullTimeEmployeeKoto();
        FullTimeEmployee fullTimeLita2 = new FullTimeEmployee(3, "Lita", 3_000_000);

        PartTimeEmployee partTimeKoto = new PartTimeEmployee(1, "Koto", 22, 11_750);

        PartTimeEmployee lita = TestCases.partTimeEmployeeLita();
        PartTimeEmployee lita2 = TestCases.partTimeEmployeeLita();
        FullTimeEmployee fullTimeLita = new FullTimeEmployee(2, "Lita", 3_000_000);

        System.out.println("Details about Koto " + koto);
        System.out.println("Details about Lita " + lita);

        System.out.println(koto2.equals(koto));
        System.out.println(lita2.equals(lita));
        System.out.println(koto.equals(partTimeKoto));
        System.out.println(lita.equals(fullTimeLita));
        System.out.println(FullTimeEmployee.getLastId());
    }
}
