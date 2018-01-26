package oop_lab7;

public class SuperCar {

    private String brand;
    private String color;
    private String engSize;

    public SuperCar(String brand, String color, String engSize) {
        this.brand = brand;
        this.color = color;
        this.engSize = engSize;
    }


    public String getSuperCarInfo() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engSize=" + engSize +" cc."+
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }
}//class