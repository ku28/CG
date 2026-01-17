public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; 

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double baseCost = DAILY_RATE * rentalDays;
        double multiplier = 1.0;
        
        String model = carModel.toLowerCase();
        if (model.contains("bmw") || model.contains("mercedes") || model.contains("audi")) {
            multiplier = 2.0; // Luxury cars cost double
        } else if (model.contains("suv") || model.contains("truck")) {
            multiplier = 1.5; // SUVs and trucks cost 50% more
        }
        
        return baseCost * multiplier;
    }

    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 (Default Constructor):");
        rental1.displayRentalInfo();
        
        System.out.println();
        
        CarRental rental2 = new CarRental("Alice Johnson", "Toyota Camry", 5);
        System.out.println("Rental 2 (Standard Car):");
        rental2.displayRentalInfo();
        
        System.out.println();
        
        CarRental rental3 = new CarRental("Bob Smith", "BMW 5 Series", 3);
        System.out.println("Rental 3 (Luxury Car):");
        rental3.displayRentalInfo();
        
        System.out.println();
        
        CarRental rental4 = new CarRental(rental3);
        System.out.println("Rental 4 (Copy Constructor):");
        rental4.displayRentalInfo();
    }
}
