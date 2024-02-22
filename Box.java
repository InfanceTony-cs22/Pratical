class Box {
    protected double length;
    protected double breadth;
    
    // Constructor for Box class
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    // Method to set values of length and breadth
    public void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    // Method to find the area of the box
    public double calculateArea() {
        return length * breadth;
    }
}

class Box3D extends Box {
    protected double height;
    
    // Constructor for Box3D class
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }
    
    // Method to set values of length, breadth, and height
    public void setDimensions(double length, double breadth, double height) {
        super.setDimensions(length, breadth);
        this.height = height;
    }
    
    // Method to find the volume of the box
    public double calculateVolume() {
        return length * breadth * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Box3D myBox = new Box3D(2.0, 3.0, 4.0);
        
        // Set dimensions
        myBox.setDimensions(3.0, 4.0, 5.0);
        
        // Calculate and print area
        double area = myBox.calculateArea();
        System.out.println("Area: " + area);
        
        // Calculate and print volume
        double volume = myBox.calculateVolume();
        System.out.println("Volume: " + volume);
    }
}
