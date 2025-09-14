package Section5.FixingExercise.Entities;

public abstract class Person {
    private String name;
    private Double anualIncome;
    public Person(){}

    public Person(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }


    public abstract Double tax();
}
