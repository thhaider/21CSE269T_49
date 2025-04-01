enum OrderStatus {
    PLACED("Your order has been placed successfully!"),
    SHIPPED("Your order is on the way!"),
    DELIVERED("Your order has been delivered. Enjoy!"),
    CANCELLED("Your order has been cancelled.");

    private final String message;
    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class OrderTracking {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;
        System.out.println(status.getMessage());
    }
}

