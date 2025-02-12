class Library {
    private int fineAmount;

    // Default constructor initializing fineAmount to 5
    public Library() {
        fineAmount = 5;
    }

    // Method to display the fine amount
    public void displayFine() {
        System.out.println("The default fine amount is: $" + fineAmount);
    }

    public static void main(String[] args) {
        // Creating an object of Library class
        Library library = new Library();
        
        // Displaying the default fine amount
        library.displayFine();
    }
}
