package ru.kirtstar.sandbox;



public class hw {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        hello("world");
        hello("Sergey");
        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
        double a = 4;
        double b = 8;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a,b));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
        return l*l;
    }
    public static double area(double a, double b) {
        return a * b;
    }

}
