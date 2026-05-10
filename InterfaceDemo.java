interface Shape {
    void area();
}

class Circle implements Shape {

    double r = 5;

    public void area() {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.area();
    }
}