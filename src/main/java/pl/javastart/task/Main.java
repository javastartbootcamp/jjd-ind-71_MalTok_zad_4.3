package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2, 5, 3);

        double squareArea = square.calculateSquareArea();
        System.out.println("Pole kwadratu: " + squareArea);

        double circleArea = circle.calculateCircleArea();
        System.out.println("Pole koła: " + circleArea);

        double rectanglePerimeter = rectangle.calculateRectPerimeter();
        System.out.println("Obwód prostokąta: " + rectanglePerimeter);

        double trianglePerimeter = triangle.calculateTrianglePerimeter();
        System.out.println("Obwód trójkąta: " + trianglePerimeter);
    }
}
