package practice_problem_08;

abstract class Employee{
    String name;
    int id;
    String department;

    abstract double calculatePay();

}

class FullTimeEmployee extends Employee{
    private double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary){
        this.name = name;
        this.department = department;
        this.id = id;
        this.fixedSalary = fixedSalary;
    }
    @Override
    double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked){
        this.name = name;
        this.department = department;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee{
    private String projectName;
    private double contractAmount;

    ContractEmployee(String name, int id, String department, String projectName, double contractAmount){
        this.name = name;
        this.department = department;
        this.id = id;
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }
    @Override
    double calculatePay() {
        return contractAmount;
    }
}


public class EmployeePay {
    public static void main(String[] args){

        Employee e1 = new FullTimeEmployee("Saikat Hossain", 2603, "SWE 1", 45000.0);
        System.out.println("Salary: " + e1.calculatePay());

        Employee e2 = new ContractEmployee("Ahmed Amin", 2610, "AI & ML", "Grneral LLM", 75000.0 );
        System.out.println("Salary: " + e2.calculatePay());

        Employee e3 = new PartTimeEmployee("Kabir Khan", 2602, "Cloud Engineer", 1500, 30);
        System.out.println("Salary: " + e3.calculatePay());

    }
}
