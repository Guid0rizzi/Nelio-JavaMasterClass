package Section1.StaticsMembers.util;

public class CalculateCircumference {
    public static final double PI = 3.14159;
    public static double Circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double Volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
