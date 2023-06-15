package pl.javastart.task;

public class ShapeCalculator {

    public double calculateSquareArea(Square square) {
        return square.getSideA() * square.getSideA();
    }

    public double calculateCircleArea(Circle circle) {
        return 3.14159 * (circle.getRadius() * circle.getRadius());
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.getSideA() + 2 * rectangle.getSideB();
    }
}
