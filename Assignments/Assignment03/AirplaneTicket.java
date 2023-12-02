package Assignments.Assignment03;

import java.util.Arrays;
import java.util.Scanner;

public class AirplaneTicket {
    // Attributes
    private static int ticketCounter = 0; // Final static
    private int ticketNumber;
    private String passengerName;
    private double price;
    private boolean isConfirmed;
    private String seatClass;
    private String[] flightDetails;

    // Constructors
    public AirplaneTicket(String passengerName, double price, String seatClass) {
        this(passengerName, price, seatClass, new String[]{"Flight ABC", "Date: 2023-12-01"});
    }

    public AirplaneTicket(String passengerName, double price, String seatClass, String[] flightDetails) {
        this.ticketNumber = ++ticketCounter;
        this.passengerName = passengerName;
        this.price = price;
        this.isConfirmed = false;
        this.seatClass = seatClass;
        this.flightDetails = flightDetails;
    }

    // Accessor Mutations (getters and setters)
    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    // Static counter function
    public static int getTicketCounter() {
        return ticketCounter;
    }

    // toString method
    @Override
    public String toString() {
        return "AirplaneTicket{" +
                "ticketNumber=" + ticketNumber +
                ", passengerName='" + passengerName + '\'' +
                ", price=" + price +
                ", isConfirmed=" + isConfirmed +
                ", seatClass='" + seatClass + '\'' +
                ", flightDetails=" + Arrays.toString(flightDetails) +
                '}';
    }

    // Main Demo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of AirplaneTicket objects
        AirplaneTicket[] tickets = new AirplaneTicket[2];

        // Populate the array with user input
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Enter details for ticket " + (i + 1) + ":");
            System.out.print("Passenger Name: ");
            String passengerName = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline
            System.out.print("Seat Class: ");
            String seatClass = scanner.nextLine();

            tickets[i] = new AirplaneTicket(passengerName, price, seatClass);
            
        }

        // Print ticket details using toString()
        for (AirplaneTicket ticket : tickets) {
            System.out.println(ticket);
        }

        // Print ticket count using static counter function
        System.out.println("Total tickets created: " + AirplaneTicket.getTicketCounter());
        scanner.close();
    }
}
