package Section1.Exercises.Entities;

public class Retangle {
    Double width;
    Double height;

    public Retangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    public double Area(){
        return width * height;
    }
    public double Perimeter(){
        return width + width + height + height;
    }
    public double Diagonal (){
        double sideWidth = Math.pow(width, 2);
        double sideHeight = Math.pow(height, 2);
        return Math.sqrt(sideWidth + sideHeight);
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "Width=" + width +
                ", Height=" + height +
                ", Area = "+Area()+
                ", Perimeter = "+ Perimeter()+
                ", Diagonal =  "+ Diagonal()+
                '}';
    }
}
