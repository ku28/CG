public class Circle {
    private double radius;

    
    public Circle() {
        this(1.0); // Calls parameterized constructor with default value
    }

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        
        Circle circle1 = new Circle();
        System.out.println("Circle 1 (Default Constructor):");
        circle1.displayInfo();
        
        System.out.println();
        
        
        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 (Parameterized Constructor):");
        circle2.displayInfo();
    }
}
