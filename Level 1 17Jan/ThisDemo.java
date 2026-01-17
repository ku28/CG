public class ThisDemo {
    private final String name;
    private final int age;

    public ThisDemo(String name, int age) {
        this.name = name; // Use this to avoid ambiguity
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        ThisDemo person = new ThisDemo("Charlie", 28);
        person.display();
    }
}
