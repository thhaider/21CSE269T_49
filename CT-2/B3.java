// Airline Booking System with Custom Exception
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

class BookingSystem {
    public void bookTicket(String name, int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Booking failed: " + name + " is under 18!");
        }
        System.out.println("Ticket booked successfully for " + name);
    }
}

public class AirlineApp {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        try {
            system.bookTicket("Ravi", 20);
            system.bookTicket("Asha", 16);
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing booking system resources...");
        }
    }
}
