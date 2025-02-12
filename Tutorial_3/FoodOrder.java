class FoodOrder {
    private String itemName;
    private int quantity;

    // Default constructor - Order "Burger" with quantity 1
    public FoodOrder() {
        this.itemName = "Burger";
        this.quantity = 1;
    }

    // Constructor with only item name - Quantity defaults to 1
    public FoodOrder(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
    }

    // Constructor with item name and quantity
    public FoodOrder(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    // Method to display order details
    public void showOrder() {
        System.out.println("Order Details:");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating objects with different constructors
        FoodOrder order1 = new FoodOrder();               // Default order
        FoodOrder order2 = new FoodOrder("Pizza");        // Custom item, default quantity
        FoodOrder order3 = new FoodOrder("Pasta", 3);     // Custom item and quantity

        // Displaying order details
        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}
