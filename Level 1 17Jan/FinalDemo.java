public class FinalDemo {
    private final int id;
    private String name;

    public FinalDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo(101, "David");
        obj.display();
        obj.setName("Daniel");
        obj.display();
    }
}
