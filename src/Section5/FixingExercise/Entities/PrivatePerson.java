package Section5.FixingExercise.Entities;

public class PrivatePerson extends Person{
    private Integer employeesNumber;

    public PrivatePerson() {
        super();
    }



    public PrivatePerson(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double tax() {
        Double baseTaxPercent = getEmployeesNumber() > 10 ? 0.14: 0.16;
        return getAnualIncome() * baseTaxPercent;

    }

}
