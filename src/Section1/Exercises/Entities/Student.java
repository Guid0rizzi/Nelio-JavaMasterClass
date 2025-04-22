package Section1.Exercises.Entities;

public class Student {
    String nome;
    Double nota1;
    Double nota2;
    Double nota3;

    public Student(String nome, Double nota1, Double nota2, Double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    public double FinalGrade(){
        return nota1+nota2+nota3;
    }
    public void AproveResult(){
        double missingPoints = 60-FinalGrade();
        if (FinalGrade() >= 60.00){
            System.out.println("Final Grade "+ FinalGrade());
            System.out.println("Pass");
        }else{
            System.out.println("Final Grade "+ FinalGrade());
            System.out.println("missing "+missingPoints+" points");
            System.out.println("Fail");
        }
    }
}
