package pl.javastart.task;

public class Square {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double calculateSquareArea() {
        return getSideA() * getSideA();
    }
}
