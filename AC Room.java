public class Room {
    // Attributes
    private int roomNumber;
    private String roomType;
    private double roomArea;
    private boolean hasAC;

    // Member functions: set data
    public void setData(int roomNumber, String roomType, double roomArea, boolean hasAC) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.hasAC = hasAC;
    }

    // Member function: display data
    public void displayData() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " square meters");
        System.out.println("AC Machine: " + (hasAC ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Example usage
        Room myRoom = new Room();
        myRoom.setData(101, "Single", 25.5, true);
        myRoom.displayData();
    }
}
