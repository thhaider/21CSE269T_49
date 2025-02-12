class MovieTicket {
    private String customerName;
    private int numTickets;

    // Parameterized constructor
    public MovieTicket(String customerName, int numTickets) {
        this.customerName = customerName;
        this.numTickets = numTickets;
    }

    // Method to display booking details
    public void showBooking() {
        System.out.println("Booking Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating objects with different bookings
        MovieTicket booking1 = new MovieTicket("Alice", 2);
        MovieTicket booking2 = new MovieTicket("Bob", 4);

        // Displaying booking details
        booking1.showBooking();
        booking2.showBooking();
    }
}
