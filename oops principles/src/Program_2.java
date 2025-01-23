abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    int monthlySalary;

    FullTimeEmployee(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println(name + "'s Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hourlyRate, hoursWorked;

    PartTimeEmployee(String name, int hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        System.out.println(name + "'s Salary: " + (hourlyRate * hoursWorked));
    }
}



public class Program_2 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 20, 80);

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}
