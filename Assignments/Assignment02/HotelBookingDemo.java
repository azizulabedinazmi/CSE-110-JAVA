package Assignments.Assignment02;

class HotelBooking {
    // 5 Attribute variations
    private String guestName;
    int numberOfGuests;  // default access modifier
    public static final int MAX_BOOKINGS = 100;
    private static int bookingCounter = 0;
    private boolean isPaid;

    // Constructor overloading (chaining)
    public HotelBooking(String guestName, int numberOfGuests) {
        this(guestName, numberOfGuests, false);
    }

    public HotelBooking(String guestName, int numberOfGuests, boolean isPaid) {
        this.guestName = guestName;
        this.numberOfGuests = numberOfGuests;
        this.isPaid = isPaid;
        bookingCounter++;
    }

    // Static counter function
    public static int getBookingCounter() {
        return bookingCounter;
    }

    // Accessor and Mutation (get, set)
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // ToString method
    @Override
    public String toString() {
        return "HotelBooking{" +
                "guestName='" + guestName + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", isPaid=" + isPaid +
                '}';
    }
}

public class HotelBookingDemo {
    public static void main(String[] args) {
        // Main Demo (object array)
        HotelBooking[] bookings = new HotelBooking[3];
        bookings[0] = new HotelBooking("John Doe", 2);
        bookings[1] = new HotelBooking("Jane Smith", 1, true);
        bookings[2] = new HotelBooking("Bob Johnson", 3);

        // Output all bookings
        for (HotelBooking booking : bookings) {
            System.out.println(booking);
        }

        // Print array
        System.out.println("Number of bookings: " + HotelBooking.getBookingCounter());
    }
}


