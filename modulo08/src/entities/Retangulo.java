package entities;

public class Retangulo {
    private double width;
    private double height;

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width*height;
    }

    public double perimeter() {
        return (width+height)*2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }
}
