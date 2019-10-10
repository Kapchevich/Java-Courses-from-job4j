package ru.job4j.condition;

public class Triangle {
    private Point x;
    private Point y;
    private Point z;

    public Triangle (Point ap, Point bp, Point cp) {
        this.x = ap;
        this.y = bp;
        this.z = cp;
    }

    public double perimetr ( double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public double area() {
        double rsl = -1;
        double a = x.distance(y);
        double b = x.distance(z);
        double c = y.distance(z);
        double p = perimetr(a,b,c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
    private boolean exist ( double a, double b, double c) {
        return a + c > b && a + b > c && b + c > a;
    }
}
