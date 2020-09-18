package LAB5;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(50);
        circle.Info();
        System.out.println();
        Rectangle rectangle = new Rectangle(50, 50);
        rectangle.Info();
        System.out.println();
        Square square = new Square(50);
        square.Info();
    }
}
