package Section2.ListIntro.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Section2.ListIntro.Exercises.Employee.position;

public class EmployeesProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered");
        Integer n = sc.nextInt();
        List <Employee> employeesList = new ArrayList<>(n);
        for (int i = 0; i < n; i++ ){
            System.out.println("Employee #"+(i+1));
            System.out.println("add the Employee's Id");
            Integer id = sc.nextInt();
            System.out.println("add the Employee's Name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("add the Employee's Salary");
            double salary = sc.nextDouble();
            employeesList.add(new Employee(id, name, salary));
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int employeesId = sc.nextInt();
        Employee emp = employeesList.stream().filter(x -> x.getId() == employeesId).findFirst().orElse(null); // aqui eu acho o funcionario
        Integer pos = position(employeesList, employeesId); //aqui eu acho a posição do funcionario

        if(emp == null){
            System.out.println("This id does not exist");

        }else {
            System.out.println("Enter the percentage");
            double percentValue = sc.nextDouble();
            employeesList.get(pos).IncreaseSalary(percentValue); // no funcionario encontrado melhorar o salario dele

            System.out.println("List of Employees");
            for (Employee employee : employeesList) {
                System.out.println(employee.Id + ", " + employee.name + ", " + employee.salary);
            }
        }
    }
}
class Employee{
   Integer Id;
   String name;
   Double salary;

    Employee(Integer Id, String name, Double salary) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }
    public void IncreaseSalary (double increaseTax){
        salary += salary * increaseTax /100;
    }
    public static Integer position (List<Employee> list , int id ){
        for(int i = 0; i< list.size(); i++){ // iterando pela lista
            if(list.get(i).getId() == id) { // verificando se o id do parametro é igual o id que esta na lista
                return i; // como o id ele fica adicionando ele vai parar na posição certa

            }
        }
        return null;
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public int charAt(int i) {
        return 0;
    }
}
