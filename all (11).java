import java.util.*;

class Rectangle {
    float area(int l, float b) {
        return l * b;
    }

    double area(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        Rectangle ref = new Rectangle();
        System.out.println(ref.area(a, b));
    }
}