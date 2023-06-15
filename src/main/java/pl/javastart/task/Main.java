package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2, 5, 3);

        ShapeCalculator calc = new ShapeCalculator();

        double squareArea = calc.calculateSquareArea(square);
        System.out.println("Pole kwadratu: " + squareArea);

        double circleArea = calc.calculateCircleArea(circle);
        System.out.println("Pole koła: " + circleArea);

        double rectanglePerimeter = calc.calculateRectPerimeter(rectangle);
        System.out.println("Obwód prostokąta: " + rectanglePerimeter);

        double trianglePerimeter = calc.calculateTrianglePerimeter(triangle);
        System.out.println("Obwód trójkąta: " + trianglePerimeter);
    }
}
