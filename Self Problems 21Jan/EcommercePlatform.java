import java.util.ArrayList;
import java.util.List;

class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private static int nextId = 1;
    private final int id;
    private final List<Product> products;
    private final Customer customer;

    public Order(Customer customer) {
        this.id = nextId++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order #" + id + " for " + customer.getName() + ":");
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getName() + ": $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class Customer {
    private final String name;
    private final List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Mouse", 25.0);
        Product p3 = new Product("Keyboard", 45.0);

        Order order1 = new Order(alice);
        order1.addProduct(p1);
        order1.addProduct(p2);
        alice.placeOrder(order1);

        Order order2 = new Order(bob);
        order2.addProduct(p2);
        order2.addProduct(p3);
        bob.placeOrder(order2);

        order1.showOrderDetails();
        order2.showOrderDetails();
    }
}
