package oop_lab8;

public class Circle implements Shape  {
    private final  double pi =3.141;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double findArea() {
        return pi*(r*r);
    }
}
