package Section5.AbstractMethods.Entities;

import Section5.AbstractMethods.Enum.Color;

public abstract class Shape {
    private Color color;
    public Shape (){

    }
    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
