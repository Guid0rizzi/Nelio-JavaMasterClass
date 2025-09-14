package Section5.FixingExercise.Entities;

public class PhysicalPerson extends Person{
    private Double healthExpenditures;

    public PhysicalPerson() {
        super();
    }



    public PhysicalPerson(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    @Override
    public Double tax() {
        Double baseTaxPercent = getAnualIncome() < 2000 ? 0.15 : 0.25; //se for menor do que dois mil, ele vai retornar ou 15% ou 25%
        Double baseTax = getAnualIncome() * baseTaxPercent;
        Double healthDescount = getHealthExpenditures() * 0.5;
        Double tax = baseTax - healthDescount;
        return tax < 0 ? 0:tax ;
    }
}
