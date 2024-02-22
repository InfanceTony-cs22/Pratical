class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        // Polymorphism in action
        displayShapeDetails(circle);
        displayShapeDetails(triangle);
        displayShapeDetails(square);
    }

    private static void displayShapeDetails(Shape shape) {
        shape.draw();
        shape.erase();
        System.out.println();
    }
}
