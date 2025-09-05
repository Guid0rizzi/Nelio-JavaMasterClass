package Section4.EntitiesWorker;

import Section4.EntitiesWorker.Enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary ;

    //ASSOCIAÇÕES
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    //(todas as associasoes que são lista eu não posso colocar ele no contrutor)
    Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public double income(int year, int month){
        Calendar cal = Calendar.getInstance();//Cria um objeto Calendar (da biblioteca do Java), que ajuda a pegar partes da data, como ano, mês, dia, etc.

        double sum = this.baseSalary;//Cria uma variável sum (soma) que começa com o valor do salário base do trabalhador.
        for (HourContract c : contracts){
            cal.setTime(c.getDate()); // deixamos a data do contrato manipulavel usando o cal.setTime
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(c_year == year && c_month == month ){
                sum += c.totalValue();
            }

        }
        return sum;
    }
}
