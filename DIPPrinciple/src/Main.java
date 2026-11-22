public class Main {
    public static void main(String[] args) {
        // Create sample orders
        Order order1 = new Order("ORD-1001", "Alice Johnson", "alice@example.com", "+1-555-0199", 149.99);

        // 1. OrderService using EmailConfirmationService
        OrderConfirmation emailService = new EmailConfirmationService();
        OrderService orderServiceWithEmail = new OrderService(emailService);
        orderServiceWithEmail.placeOrder(order1);


    }
}
