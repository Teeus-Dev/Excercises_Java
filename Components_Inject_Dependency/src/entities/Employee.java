package entities;

public class Employee {
    private String name;
    private Double grossSalary;

    public Employee(){
    }

    public Employee(String name, Double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
