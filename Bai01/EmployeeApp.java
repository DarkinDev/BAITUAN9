package BAITUAN9.Bai01;

public class EmployeeApp {
    public static void main(String[] args) {
        IEmployee partTimeEmployee = new PartTimeEmployee("Gia Huy", 20, 5);
        IEmployee fullTimeEmployee = new FullTimeEmployee("Thuyet Minh", 30);

        System.out.println(partTimeEmployee.getName() + "'s Salary: " + partTimeEmployee.calculateSalary());
        System.out.println(fullTimeEmployee.getName() + "'s Salary: " + fullTimeEmployee.calculateSalary());
    }
}