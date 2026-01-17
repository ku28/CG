public class Animal {}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}
public class InstanceofDemo {
    public static void makeSound(Animal animal) {
        switch (animal) {
            case Dog dog -> dog.bark();
            case Cat cat -> cat.meow();
            default -> System.out.println("Unknown animal");
        }
    }
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        Animal c = new Animal();
        makeSound(a);
        makeSound(b);
        makeSound(c);
    }
}
