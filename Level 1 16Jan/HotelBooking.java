public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    
    public double calculateTotalCost() {
        double pricePerNight;
        pricePerNight = switch (roomType.toLowerCase()) {
            case "standard" -> 100.0;
            case "deluxe" -> 150.0;
            case "suite" -> 250.0;
            default -> 100.0;
        };
        return pricePerNight * nights;
    }

    
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 (Default Constructor):");
        booking1.displayBooking();
        
        System.out.println();
        
        
        HotelBooking booking2 = new HotelBooking("John Smith", "Deluxe", 3);
        System.out.println("Booking 2 (Parameterized Constructor):");
        booking2.displayBooking();
        
        System.out.println();
        
        
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 (Copy Constructor):");
        booking3.displayBooking();
    }
}
