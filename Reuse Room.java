class Room {
    private int length;
    private int width;

    public Room(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

// Reuse class
class ReuseExample {
    public static void main(String[] args) {
        // Creating an instance of the Room class
        Room myRoom = new Room(10, 8);

        // Calculating and displaying the area of the room
        int area = myRoom.calculateArea();
        System.out.println("The area of the room is: " + area + " square units");
    }
}
