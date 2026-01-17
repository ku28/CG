public class StaticDemo {
    // Static variable shared by all instances
    public static int sharedCount = 0;
    // Static final constant
    public static final double PI = 3.14159;

    // Instance variable
    private final String name;

    public StaticDemo(String name) {
        this.name = name;
        sharedCount++;
    }

    // Static utility method
    public static int getSharedCount() {
        return sharedCount;
    }

    public static void printWelcome() {
        System.out.println("Welcome to StaticDemo!");
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        StaticDemo.printWelcome();
        StaticDemo a = new StaticDemo("Alice");
        StaticDemo b = new StaticDemo("Bob");
        a.display();
        b.display();
        System.out.println("Shared Count: " + StaticDemo.getSharedCount());
        System.out.println("PI: " + StaticDemo.PI);
    }
}
