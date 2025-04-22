package Section1.OOP.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area (){ //--- Não precisa de parametro pois tudo ja esta dentro da classe
        double p = (a +b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
