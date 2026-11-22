public class EmailConfirmationService implements OrderConfirmation {
    @Override
    public void confirmOrder(Order order) {
        System.out.println("[Email] Confirmation email sent to " + order.getCustomerEmail() +
                " for Order ID: " + order.getOrderId() +
                " (Total: $" + order.getTotalAmount() + ")");
    }
}
