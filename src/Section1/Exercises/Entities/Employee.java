package Section1.Exercises.Entities;

public class Employee {
    String name;
    Double grossSalary;
    Double tax;

    public Employee(String name, Double grossSalary, Double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    public double NetSalary(){
        return  this.grossSalary - this.tax;
    }
    public double IncreaseSalary(double percentage){
        double result = grossSalary*(percentage/100);
        return NetSalary()+result;
    }
}
