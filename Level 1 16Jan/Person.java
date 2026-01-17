public class Person {
    private String name;
    private int age;
    private String address;

    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        
        Person person1 = new Person("Alice", 25, "123 Main St");
        System.out.println("Person 1 (Original):");
        person1.displayInfo();
        
        System.out.println();
        
        
        Person person2 = new Person(person1);
        System.out.println("Person 2 (Copy):");
        person2.displayInfo();
        
        System.out.println();
        
        
        person2.setName("Bob");
        person2.setAge(30);
        System.out.println("After modifying Person 2:");
        System.out.println("Person 1:");
        person1.displayInfo();
        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
